package com.uchoice.ucenter.biz.common;

import tk.mybatis.mapper.entity.Example;

/**
 * Created by ${admin} on 2017/6/17.
 */
public class BizException extends Exception{
    public BizException() {
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
