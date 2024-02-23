package com.qquhuan.String;

public class Replace {
    public static void main(String[] args) {
        String s = "qqhuan";
        String s2 = s.replace('q', 'd');
        System.out.println(s2);
        String s3 = s2.replace("dd", "x");
        System.out.println(s3);
    }
}
