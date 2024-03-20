package com.qquhuan.regex;

public class MyRegex {
    public static void main(String[] args) {
        String re = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        System.out.println("qqq@qq.com".matches(re));
    }
}
