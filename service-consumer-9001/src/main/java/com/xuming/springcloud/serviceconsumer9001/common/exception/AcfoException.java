package com.xuming.springcloud.serviceconsumer9001.common.exception;

import lombok.Getter;

/**
 * 系统通用异常
 *
 * Created by zhongjunkai on 2019/3/19.
 */
@Getter
public class AcfoException extends RuntimeException {

    private String code;

    public AcfoException(String code, String message) {
        super(message);
        this.code = code;
    }
}
