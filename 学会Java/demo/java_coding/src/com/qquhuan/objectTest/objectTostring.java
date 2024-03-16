package com.qquhuan.objectTest;

import java.util.Objects;

public class objectTostring {
    public static void main(String[] args) {
        A a = new A("qih", 18);
        A b = new A("qih", 18);
        System.out.println(a);
        System.out.println(a.toString());

        boolean isSame = a.equals(b);
        isSame = Objects.deepEquals(a, b);
        System.out.println(Objects.isNull(a));
        System.out.println(isSame);
        // 类名全称@+hash值
        // hash值是对象地址经过hash算法计算之后得到的值，经过Integer方法转成十六进制
    }
}

class A{
    public String Name;
    public int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public A(String name, int age) {
        Name = name;
        Age = age;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "A{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o; // 强转
        return getAge() == a.getAge() && Objects.equals(getName(), a.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}