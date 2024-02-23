package com.qquhuan.Set;

import com.qquhuan.classes.Student;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setName("邱焕");
        list.add(stu1);
        Student stu2 = new Student();
        stu2.setName("邱焕2");
        list.add(stu2);
        for(Student s : list) {
            System.out.println(s.getName());
        }
        String str = list.toString();
        System.out.println(str);

        Student[] arr = new Student[2];
        list.toArray(arr);
        for(Student stu : arr) {
            System.out.println(stu.getName());
        }
    }
}
