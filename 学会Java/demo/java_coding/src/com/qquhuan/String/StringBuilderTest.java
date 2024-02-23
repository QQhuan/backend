package com.qquhuan.String;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(true); // "true"
        sb.append(90.1);
        sb.append("sss");
        System.out.println(sb);
        StringBuilder s2 = sb.reverse();
        System.out.println(s2 == sb);
        System.out.println(s2.length());
        System.out.println(s2.indexOf("s"));
    }
}
