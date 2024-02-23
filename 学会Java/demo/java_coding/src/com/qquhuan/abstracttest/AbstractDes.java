package com.qquhuan.abstracttest;

import java.sql.Struct;

public class AbstractDes {
    public static void main(String[] args) {
        Student s1 = new Student("qiu", 26, "sy109");
        s1.work();
        s1.printName();
    }
}
abstract class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void work(){
        System.out.println("我正在工作...");
    }

    public abstract void printName();
}

class Student extends Person {
    private String sid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    Student(String name, int age, String sid) {
        super(name, age);
        setSid(sid);
    }

    @Override
    public void printName() {
        System.out.println("学号:"+getSid()+" 姓名:"+getName());
    }
}