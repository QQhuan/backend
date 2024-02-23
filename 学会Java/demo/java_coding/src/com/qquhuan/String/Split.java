package com.qquhuan.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s = "qqhuan";
        String[] s2 = s.split(""); // 转移字符要用两反斜杠 \\

        for(String str : s2) {
            System.out.println(str);
        }
        System.out.println(Arrays.toString(s2));
    }
}
