package com.qquhuan.classes;

public class Student {
    private String sid;
    private String name;

    static int count;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
        name = "xxx";
        sid = "SY";
    }

    public void printInfo() {
        System.out.println(sid+"-"+name);
    }
}
