package com.qquhuan.InterfaceTest;

public class InterfaceT {
    public static void main(String[] args) {
        Tnter i1 = new Tnter();
        i1.show();
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