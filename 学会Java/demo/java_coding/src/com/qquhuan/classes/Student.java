package com.qquhuan.classes;

public class Student {
    private String sid;
    private String name;
    static String School = "中国农业大学";

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

    public Student(String SName, String Sid) {
        name = SName;
        sid = Sid;
    }

    public Student(){
        name = "sname";
        sid = "sid";
    }

    public void printInfo() {
        System.out.println(sid+"-"+name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
