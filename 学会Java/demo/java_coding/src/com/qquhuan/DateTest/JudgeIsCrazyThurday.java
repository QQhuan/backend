package com.qquhuan.DateTest;

import java.util.Calendar;

public class JudgeIsCrazyThurday {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2050, Calendar.MARCH, 1);
        int weekDay = c.get(Calendar.DAY_OF_WEEK);
        if(weekDay == 5) {
            System.out.println("疯狂星期四！V我50看看实力！");
        } else {
            System.out.println("不是疯狂星期四。");
        }
        System.out.println(c.getTime());
    }
}
