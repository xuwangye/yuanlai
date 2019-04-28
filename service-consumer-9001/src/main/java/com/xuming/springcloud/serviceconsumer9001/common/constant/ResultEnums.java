package com.xuming.springcloud.serviceconsumer9001.common.constant;

import lombok.Getter;

/**
 * 请求处理结果枚举
 *
 * Created by zhongjunkai on 2019/3/19.
 */
@Getter
public enum ResultEnums {

    SUCCESS("1", "成功"),
    ERROR("0", "发生异常");

    private String code;

    private String msg;

    ResultEnums(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
