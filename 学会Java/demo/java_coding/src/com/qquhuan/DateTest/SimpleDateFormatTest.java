package com.qquhuan.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        /*
         * 日期格式化
         * String SimpleDateFormat() 构造一个SimpleDateFormat 使用默认格式
         * String SimpleDateFormat(String pattern) 构造一个SimpleDateFormat 使用指定格式 ————参照日期时间格式化编码，模式字符串来指定
         *
         *
         * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 年第w周 月第W周 年第D天 月第d天 月份中过的星期数F 星期中的天数E a HH:mm:ss KK:mm:ss S z Z");

        Date date = new Date();

        String str = sdf.format(date);

        System.out.println(str);
    }
}
