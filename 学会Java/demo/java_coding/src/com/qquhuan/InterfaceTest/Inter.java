package com.qquhuan.InterfaceTest;

public interface Inter {
    void select();

    void update();

    default void show() {
        System.out.println("默认方法，实现类可以不必重写本方法！");
    }
}
