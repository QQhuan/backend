package com.qquhuan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String data = "qqhuan@qq.com 010-9876543";
        String re = "[0]\\d{2,3}-?\\d{6,8}|^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+";

        // 1、将正则表达式封装为Pattern对象
        Pattern pattern = Pattern.compile(re);

        // 2、获取匹配器对象
        Matcher matcher = pattern.matcher(data);

        /*System.out.println(matcher.find()); // 是否有
        System.out.println(matcher.group()); // 需要循环调用，一次一个，且搭配find使用

        System.out.println(matcher.find()); // 是否有
        System.out.println(matcher.group()); // 需要循环调用，一次一个，且搭配find使用*/

        while(matcher.find()){
            System.out.println(matcher.group()); // 需要循环调用，一次一个，且搭配find使用
        }
    }
}
