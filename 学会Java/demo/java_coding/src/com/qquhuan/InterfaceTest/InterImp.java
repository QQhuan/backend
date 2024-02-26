package com.qquhuan.InterfaceTest;

public class InterImp {
    public static void main(String[] args) {
        Inter_1 inter1 = new Inter_1();
        inter1.show();
    }
}

class Inter_1 implements Inter {
    @Override
    public void select() {

    }

    @Override
    public void update() {

    }
}

class Inter_2 implements Inter {

    @Override
    public void select() {

    }

    @Override
    public void update() {

    }
}