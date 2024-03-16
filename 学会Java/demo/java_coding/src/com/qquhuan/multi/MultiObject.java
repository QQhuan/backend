package com.qquhuan.multi;

public class MultiObject {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        eat(a);
        eat(b);
    }

    public static void eat(Animal animal){ // 参数类型为父类
        animal.eat();
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("猫吃东西");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃东西");
    }
}