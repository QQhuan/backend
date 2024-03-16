package com.qquhuan.multi;

public class MultiMember {
    public static void main(String[] args) {
        /*
        * 多态
        * 成员变量的编译与运行读取
        * 1、编译运行都是看左边，即读取父类
        *   编译什么意思？编写代码之后，是否会显示无法读取
        *
        * 成员方法的编译和运行读取？
        * 1、编译看父类
        * 2、运行时执行子类方法逻辑
        * 父类的方法可能是抽象方法【接口/抽象类】
        * */
        Fu f = new Zi();
        System.out.println(f.label+"-"+ f.num);

        f.show();
    }
}

class Fu {
    static int num = 1;
    String label = "父类";

    void show(){
        System.out.println(label);
    }
}

class Zi extends Fu{
     static int num = 2;
    String label = "子类";

    void show(){
        System.out.println("啊哈哈"+label);
    }
}