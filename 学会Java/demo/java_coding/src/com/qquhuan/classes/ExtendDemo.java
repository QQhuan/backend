package com.qquhuan.classes;

public class ExtendDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
    }
}

class Employee {
    String name;
    int age;
    double salary;
    public void work() {
        System.out.println("干活！");
    }
}
class Manager extends Employee {
    // 方法重写
    @Override
    public void work() {
        // super.work();
        System.out.println("摸鱼");
    }
}
