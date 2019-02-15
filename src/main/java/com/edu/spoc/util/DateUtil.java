package com.edu.spoc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化工具,高效,线程安全
 *
 * @author wjc
 */
public class DateUtil {
    /**
     * 默认格式化模板
     */
    private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
    /**
     * threadLocal 存放SimpleDateFormat 格式化对象
     */
    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();

    /**
     * 默认格式化方法, 时间转字符串
     *
     * @param date target date
     * @return data string
     */
    public static String format(Date date) {
        return format(date, DEFAULT_PATTERN);
    }

    /**
     * 根据模板式化方法, 时间转字符串
     *
     * @param date target date
     * @return data string
     */
    public static String format(Date date, String pattern) {
        if (threadLocal == null) {
            return new SimpleDateFormat(pattern).format(date);
        } else if (threadLocal.get() == null) {
            threadLocal.set(new SimpleDateFormat(pattern));
        }
        return threadLocal.get().format(date);
    }

}
