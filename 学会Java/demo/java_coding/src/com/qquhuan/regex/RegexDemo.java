package com.qquhuan.regex;

public class RegexDemo {
    public static void main(String[] args) {
        String regex_1 = "[abc]"; // 只能是abc中的一个，[]中括号代表的是单个字符
        boolean res_1 = "a".matches(regex_1);
        System.out.println(res_1);

        String regex_2 = "[^abc]"; // abc除外的任何字符
        boolean res_2 = "a".matches(regex_2);
        System.out.println(res_2);

        String regex_3 = "[a-zA-Z0-9]";
        boolean res_3 = "A".matches(regex_3);
        System.out.println(res_3);

        String regex_4 = "[a-z&&[^bc]]"; //
        boolean res_4 = "b".matches(regex_4);
        System.out.println(res_4);

        String regex_5 = "\\d"; // 数字
        boolean res_5 = "1".matches(regex_5);
        System.out.println(res_5);

        String regex_6 = "\\w"; // [a-zA-Z_0-9]
        boolean res_6 = "X".matches(regex_6);
        System.out.println(res_6);

        // \\W = [^\w] 一个非单词字符


        /*
        * 数量
        * X? 一次或者0次
        * X* 零次或者多次
        * X+ 一次或者多次
        * X{n} 正好n次
        * X{n,} 至少n次
        * X{n,m} 至少n但不超过m次
        * */
    }
}
