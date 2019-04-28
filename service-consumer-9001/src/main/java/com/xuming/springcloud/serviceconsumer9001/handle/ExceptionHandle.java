package com.xuming.springcloud.serviceconsumer9001.handle;

import com.google.gson.Gson;
import com.xuming.springcloud.serviceconsumer9001.common.constant.ResultEnums;
import com.xuming.springcloud.serviceconsumer9001.common.exception.AcfoException;
import com.xuming.springcloud.serviceconsumer9001.common.vo.Result;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * 异常处理类，用以处理系统中抛出的异常
 * <p>
 * Created by zhongjunkai on 17/11/27.
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    /**
     * 捕获异常，返回Result对象，并将异常记录到日志中
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        Result result = new Result();
        result.setCode(ResultEnums.ERROR.getCode());
        //可以根据不同的异常类型采取不同的处理方式
        if (e instanceof AcfoException) {
            AcfoException exception = (AcfoException) e;
            result.setCode(exception.getCode());
            result.setMsg(exception.getMessage());
        } else if(e instanceof FeignException){
            String msg = StringUtils.substringAfter(e.getMessage(),"content:\n");
            Map<String,String> map = new Gson().fromJson(msg,Map.class);
            if(map != null){
                result.setCode("0");
                result.setMsg(map.get("message"));
            }else{
                result.setMsg(ResultEnums.ERROR.getMsg());
            }
        } else{
            result.setMsg(ResultEnums.ERROR.getMsg());
        }
        log.error("【系统异常】: ", e);
        return result;
    }
}
