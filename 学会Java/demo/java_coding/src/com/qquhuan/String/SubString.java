package com.qquhuan.String;

public class SubString {
    public static void main(String[] args) {
        String s = "qqhuan"; // substring会返回一个新的字符串
        String s2 = s.substring(0, 2);  // 如同js的splice方法，截取的新字符串只截到第二参数前一个下标
        System.out.println(s2);
    }
}
