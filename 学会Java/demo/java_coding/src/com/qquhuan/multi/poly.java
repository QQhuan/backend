package com.qquhuan.multi;

import com.qquhuan.InterfaceTest.MImp1;
import com.qquhuan.InterfaceTest.MImp2;
import com.qquhuan.InterfaceTest.MultiTextInterface;

import java.util.Scanner;


/*
* 多态
* 接口可以存其不同实现类的引 用
* */
public class poly {
    public static void main(String[] args) {
        MultiTextInterface m = null;

        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1:
                m = new MImp1();
                break;

            case 2:
                m = new MImp2();
                break;
            default: break;
        }

        m.login();
        m.pay();
        int res = m.finish();
        System.out.println(res);
    }
}
