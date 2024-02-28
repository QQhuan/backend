package com.qquhuan.InterClass;

import com.qquhuan.InterfaceTest.Inter;

public class StaticInner {
    public static void main(String[] args) {
        OuterClass.InnerClass.show();
        userInter(new InterFaceClass()); // 复杂的使用方法
        userInter(new InterFace() {
            @Override
            public void show() {
                System.out.println("便捷的调用方法，直接new接口代表实现该接口");
                System.out.println("便捷的调用方法，直接new类代表实现该类");
            }
        });
    }

    // 方法形参是接口类型，我们应该传入接口的实现类对象

    public static void userInter(InterFace i) {
        i.show();
    }
}

interface InterFace {
    void show();
}

class InterFaceClass implements InterFace {
    @Override
    public void show() {
        System.out.println("正常为了调用参数是接口类型的方法，需要实现 该接口，并重写接口方法");
    }
}

class OuterClass {
    public int num = 1;
    static int age = 2;
    // 静态内部类
    static class  InnerClass {
        public static void show(){
            // 局部内部类
            class PartInner {

            }
            System.out.println("静态内部类");
        }
    }
}
