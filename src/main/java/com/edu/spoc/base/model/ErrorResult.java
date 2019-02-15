package com.edu.spoc.base.model;

import org.springframework.http.HttpStatus;

/**
 * 错误结果返回类
 *
 * @author wjc
 */
public class ErrorResult extends Result {
    /**
     * 错误结果数据
     */
    private Object data;

    public ErrorResult() {
        this(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
    }

    public ErrorResult(int code) {
        this(code, null);
    }

    public ErrorResult(Object data) {
        this(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), data);
    }

    public ErrorResult(int code, Object data) {
        this(code, HttpStatus.resolve(code).getReasonPhrase(), data);
    }


    public ErrorResult(int code, String msg, Object data) {
        super(code, msg);
        this.data = data;
    }

    public ErrorResult(HttpStatus httpStatus, Object data) {
        super(httpStatus.value(), httpStatus.getReasonPhrase());
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
