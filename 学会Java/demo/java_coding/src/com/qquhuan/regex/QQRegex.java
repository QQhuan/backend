package com.qquhuan.regex;

public class QQRegex {
    public static void main(String[] args) {
        String qq = "[1-9]\\d{4,11}";
        System.out.println("469558400".matches(qq));
    }
}
