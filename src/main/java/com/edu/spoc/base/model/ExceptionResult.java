package com.edu.spoc.base.model;

import org.springframework.http.HttpStatus;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

/**
 * 异常结果类
 *
 * @author wjc
 */
public class ExceptionResult extends Result {

    private ExceptionInfo exceptionInfo;

    public ExceptionResult(Exception exception, StringBuffer url) {
        if (exception instanceof IllegalArgumentException) {
            super.setCode(HttpStatus.BAD_REQUEST.value());
            super.setMsg(HttpStatus.BAD_REQUEST.getReasonPhrase());
        } else {
            super.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            super.setMsg(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        if (url == null) {
            this.exceptionInfo = new ExceptionInfo(exception);
        } else {
            this.exceptionInfo = new ExceptionInfo(exception, url.toString());
        }
    }

    public ExceptionResult() {
    }


    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(ExceptionInfo exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    /**
     * 异常信息返回结果内部类
     */
    private class ExceptionInfo {
        /**
         * 异常主要信息
         */
        private String message;
        /**
         * 堆栈信息
         */
        private String stackTrace;
        /**
         * 请求路径
         */
        private String path;

        private ExceptionInfo() {
        }

        private ExceptionInfo(Exception e) {
            this(e, null);
        }

        private ExceptionInfo(Exception e, String url) {
            this.message = e.toString();
            this.path = url;
            //将堆栈输出byte数组流，在转化为字符串
            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            e.printStackTrace(new PrintWriter(buf, true));
            this.stackTrace = buf.toString();
            //内存流无需关闭
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStackTrace() {
            return stackTrace;
        }

        public void setStackTrace(String stackTrace) {
            this.stackTrace = stackTrace;
        }
    }

}
