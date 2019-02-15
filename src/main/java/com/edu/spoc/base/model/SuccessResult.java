package com.edu.spoc.base.model;

import org.springframework.http.HttpStatus;

/**
 * 成功结果返回类
 *
 * @author wjc
 */
public class SuccessResult extends Result {
    /**
     * 成功结果数据
     */
    private Object data;

    public SuccessResult() {
        this(HttpStatus.OK.getReasonPhrase(), null);
    }

    public SuccessResult(String msg) {
        this(msg, null);
    }

    public SuccessResult(Object data) {
        this(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK.getReasonPhrase());
    }

    public SuccessResult(String msg, Object data) {
        super(HttpStatus.OK.value(), msg);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
