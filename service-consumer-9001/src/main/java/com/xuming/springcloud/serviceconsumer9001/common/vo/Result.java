package com.xuming.springcloud.serviceconsumer9001.common.vo;

import lombok.Data;

/**
 * 同一返回结果封装类
 *
 * Created by zhongjunkai on 17/11/27.
 */
@Data
public class Result<T> {

    /**
     * 错误码
     */
    private String code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 结果数据
     */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
