package com.qquhuan.DateTest;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        /*
        * 构造方法：
        * 1. Date() 返回当前时间
        * 2. Date(long time) 毫秒值
        *
        * 常用方法：
        * 1. getTime() return long
        * 2. setTime(long time) 设置日期对象为当前时间毫秒值对应的时间
        * */
        Date now = new Date();
        System.out.println(now);

        Date d2 = new Date(0L);
        System.out.println(d2);

        long t = now.getTime();
        System.out.println(t);
    }
}
