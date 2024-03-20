package com.qquhuan.regex;

public class MailRegex {
    public static void main(String[] args) {
        String mail = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("qqhuan@163.com".matches(mail));
    }
}
