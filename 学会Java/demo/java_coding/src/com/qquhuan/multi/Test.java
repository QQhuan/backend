package com.qquhuan.multi;

public class Test {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count); // 10， 注意：变量是静态绑定
    }
}

class Base {
    int count = 10;
}

class  Sub extends Base {
    int count = 20;
}