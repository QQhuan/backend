package com.qquhuan.regex;

public class TelRegex {
    public static void main(String[] args) {
        String tel = "1[3-9]\\d{9}";
        System.out.println("15521154941".matches(tel));
    }
}
