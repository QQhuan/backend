package com.qquhuan.String;

public class ToCharArray {
    public static void main(String[] args) {
        String s = "qqhuan";
        char[] chs = s.toCharArray(); // 转化为字符数组
        for(char ch : chs) {
            System.out.println(ch);
        }
    }
}
