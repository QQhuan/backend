package com.qquhuan.String;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "123456";
        String vertificationCode = "0909";

        System.out.println("请输入用户名：");
        String inputUsername = sc.nextLine();

        if(!username.equals(inputUsername)) {
            System.out.println("用户名不存在！");
            return;
        }

        System.out.println("请输入密码：");
        String inputPassword = sc.nextLine();



        if(!password.equals(inputPassword)) {
            System.out.println("密码不正确！");
            return;
        }

        System.out.println("请输入验证码：");
        String inputVertificationCode = sc.nextLine();

        if(!vertificationCode.equalsIgnoreCase(inputVertificationCode)) {
            System.out.println("验证码不正确！");
            return;
        }

        System.out.println("登录成功！");
    }
}
