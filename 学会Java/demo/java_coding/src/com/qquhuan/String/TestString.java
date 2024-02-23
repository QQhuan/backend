package com.qquhuan.String;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc"; // s1和s2存放在公共池
        String s3 = new String("abc"); // 新建在堆中
        String s4 = new String("abc"); // 新建在堆中
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false
    }
}
