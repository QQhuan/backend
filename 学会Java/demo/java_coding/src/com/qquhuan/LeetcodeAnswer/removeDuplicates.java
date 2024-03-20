package com.qquhuan.LeetcodeAnswer;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(solution(s));
    }

    private static String solution(String s){
        char[] arr = s.toCharArray();
        int len = arr.length;
        if(len == 1) {
            return String.valueOf(arr[0]);
        }
        Stack<Character> stack = new Stack<Character>();
        stack.push(arr[0]);
        for(int i = 1; i < len; i++) {
            if(stack.empty()) {
                stack.push(arr[i]);
                continue;
            }
            char p = stack.peek();
            if(p == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        return String.valueOf(sb.reverse());
    }
}
