package com.edu.spoc.util;

/**
 * 算数工具类
 *
 * @author wjc
 */
public class MathUtil {
    /**
     * 随机生成int
     *
     * @param min 最小值
     * @param max 最大值-不超过
     * @return
     */
    public static int getRandomInt(long min, long max) {
        return (int) (Math.random() * (max - min) + min);
    }

    /**
     * 随机生成long
     *
     * @param min 最小值
     * @param max 最大值-不超过
     * @return
     */
    public static int getRandomLong(long min, long max) {
        return (int) (Math.random() * (max - min) + min);
    }


}
