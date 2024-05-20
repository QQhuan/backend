package com.qquhuan.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FanClassDemo {
    public static void main(String[] args) {
        StudentT<Integer> stu = new StudentT<>();
        stu.setA(0);
        System.out.println(stu.toString());

        String[] arr1 = {"qq", "wx", "zfb"};
        Integer[] arr2 = {11, 22, 33};
        Double[] arr3 = {11.1, 22.2, 33.3};

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);

        ArrayList<Manager> list1 = new ArrayList<>();
        list1.add(new Manager());
        ArrayList<Coder> list2 = new ArrayList<>();
        list2.add(new Coder());
        method(list1);
        method(list2);
    }

    public static void method(ArrayList<? extends Employee> list){
        for(Employee o : list) {
            Employee e = o;
        }
    }

    public static <T> void printArr(T[] arr) {
        System.out.println('[');
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]+"]");
    }
}
class Employee {

}
class Manager extends Employee {

}

class Coder extends Employee {

}

class StudentT<E> {
    private E a;

    public void setA(E a) {
        this.a = a;
    }

    public E getA() {
        return a;
    }

    @Override
    public String toString() {
        return "StudentT{" +
                "a=" + a +
                '}';
    }
}

interface Inter<E> {
    void show(E e);
}

class InterImp implements Inter<String> {
    @Override
    public void show(String s) {

    }
}
class InterImpp1<E> implements Inter<E> {
    @Override
    public void show(E e){

    }
}
