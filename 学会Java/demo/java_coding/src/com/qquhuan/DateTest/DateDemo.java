package com.qquhuan.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        /*
        * 需求：计算来到这个世界上这个世界多少天
        * 分析：
        *  1. 键盘输入用户生日
        *  2. 创建SimpleDateFormat对象，指定模式，用于将日期字符串解析为Date日期对象
        *  3. 创建Date日期对象，封装此刻的时间
        *  4. long time = todayDate.getTime() - birthday.getTime();
        *  5. 将毫秒值转换为天 time/1000/60/60/24
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：yyyy年MM月dd日");
        String birthday = sc.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date birthdayDate = simpleDateFormat.parse(birthday);
        long birthdaySed = birthdayDate.getTime();

        Date today = new Date();
        long todaySed = today.getTime();

        long time = todaySed - birthdaySed;

        System.out.println(time/1000/60/60/24+"天");

    }
}
