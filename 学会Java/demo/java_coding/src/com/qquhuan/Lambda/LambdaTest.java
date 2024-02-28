package com.qquhuan.Lambda;

public class LambdaTest {
    public static void main(String[] args) {
        userInterA(new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        });

        // 简化，Lambda表达式只允许操作函数式编程接口，即仅有一个抽象方法的接口
        userInterA(() -> {
            System.out.println("Lambda重写之后的show方法");
        });
    }

    public static void userInterA(A a) {
        a.show();
    }
}
interface A {
    void show();

    // void eat();
}

interface B {
    int getNumber();
}
