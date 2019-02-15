package com.edu.spoc.constant;

/**
 * 请求响应码
 *
 * @author wjc
 */
public enum HttpCode {
    /**
     * 500请求成功
     */
    SUCCESS("success", 200),
    /**
     * 400请求参数错误
     */
    BAD_REQUEST("request params error", 400),
    /**
     * 500服务器错误
     */
    SERVER_ERROR("server error", 500),
    /**
     * 401没有登录
     */
    UNAUTHORIZED("no login", 401),
    /**
     * 403没有权限
     */
    FORBIDDEN("no power", 403),
    /**
     * 404找不到页面
     */
    NOT_FOUND("not found", 404);

    public String name;
    public int code;

    HttpCode(String name, int code) {
        this.name = name;
        this.code = code;
    }

}
