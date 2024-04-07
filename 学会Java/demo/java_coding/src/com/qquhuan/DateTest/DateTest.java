package com.qquhuan.DateTest;

import java.text.SimpleDateFormat;
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
        * 2. setTime()
        * */
        Date now = new Date();
        System.out.println(now);

        Date d2 = new Date(0L);
        System.out.println(d2);

        long t = now.getTime();
        System.out.println(t);

        // SimpleDateFormat类 用于日期格式化
        SimpleDateFormat format = new SimpleDateFormat();

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d3 = new Date();
        System.out.println(format.format(d3));
    }
}
