package com.edu.spoc.util;

import java.util.Date;
import java.util.UUID;

/**
 * String工具类
 *
 * @author wjc
 */
public class StringUtil extends org.apache.commons.lang3.StringUtils {

    private static final String PATTERN = "yyMMddHHmmss";

    /**
     * 主键生成方法--纯数字
     *
     * @return
     */
    public synchronized static String generateKey() {
        return "8756" + DateUtil.format(new Date(), PATTERN) + System.currentTimeMillis() + MathUtil.getRandomInt(100, 999);
    }

    /**
     * 主键生成方法
     *
     * @return
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");

    }

    /**
     * 主键生成方法-多个
     *
     * @param num 个数
     * @return
     */
    public String generateKey(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(generateKey());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateUUID());
        }
    }


}
