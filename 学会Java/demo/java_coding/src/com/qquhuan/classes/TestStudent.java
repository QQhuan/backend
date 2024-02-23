package com.qquhuan.classes;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName()+"-"+student.getSid());
        student.setName("邱焕");
        student.setSid("SY2023308");
        System.out.println(Student.count);
        System.out.println(student.getName()+"-"+student.getSid());
    }
}
