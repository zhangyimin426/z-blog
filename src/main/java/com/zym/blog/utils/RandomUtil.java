package com.zym.blog.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @author Gavin
 * @date 2016-09-29
 */
public class RandomUtil {
    private static Random r = new Random();

    private RandomUtil() {

    }

    /**
     * 获得一个随机整数，取值范围 [0,end)
     *
     * @param end 结束值，不包含。
     * @return 随机整数
     */
    public static int getInt(int end) {
        return r.nextInt(end);
    }

    /**
     * 获得一个随机整数
     *
     * @param start 起始值，包含。
     * @param end   结束值，不包含。
     * @return 随机整数
     */
    public static int getInt(int start, int end) {
        return start + r.nextInt(end - start);
    }

    /**
     * 获得指定长度的随机数字的字符串
     *
     * @param len 随机串的长度
     * @return 随机串
     */
    public static String getNumbers(int len) {
        StringBuilder numbers = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            numbers.append(r.nextInt(10));
        }
        return numbers.toString();
    }

    /**
     * 获得指定数目的UUID
     *
     * @param number int 需要获得的UUID数量
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = getUUID();
        }
        return ss;
    }

    /**
     * 获得一个UUID
     *
     * @return String UUID
     */
    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            System.out.println(getInt(5, 10));
//        }
//
//        System.out.println(getUUID());
//    }
}
