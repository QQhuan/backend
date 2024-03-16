package com.qquhuan.InterfaceTest;

public class InterfaceT {
    public static void show() {
        System.out.println("你好");
    }
    public static void main(String[] args) {
//        Tnter i1 = new Tnter();
//        i1.show();
        // Fu.getName();

        Fu f = new Fu();

    }
}

interface Interface1 {
    public void show();
}

class Tnter implements Interface1 {
    @Override
    public void show() {  
        System.out.println("Nihao");
    }
}

interface A {
    void show();
}

interface B {
    void show();
    void print();
}

interface C extends A, B {
    void printC();
}

class CImp implements C{
    @Override
    public void show() {

    }

    @Override
    public void print() {

    }

    @Override
    public void printC() {

    }
}

class CImp2 implements C {
    @Override
    public void show() {

    }

    @Override
    public void print() {

    }

    @Override
    public void printC() {

    }
}

/*
* 接口的多实现
* 一个类可以实现多个接口
* */
class ABImpl implements A, B {
    @Override
    public void show() {
        System.out.println("一个类可以实现多个接口，并且接口中有重名方法不冲突");
    }

    @Override
    public void print() {
        System.out.println("当然，所有方法都需要实现！");
    }
}

class Fu{
    public static void getName(){
        System.out.println("我叫XX");
    }
    public void show() {
        System.out.println("hello");
    }
}

class Zi extends Fu implements A {
    /*
    * 不用再次重写show方法
    * 因为已经从Fu类中继承了show方法
    * 相当于已经重写了接口中的show
    * */
}