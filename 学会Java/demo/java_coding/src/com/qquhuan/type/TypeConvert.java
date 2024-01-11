package com.qquhuan.type;

public class TypeConvert {
    public static void main(String[] args) {
        System.out.println("隐式转换");
        byte a = 10;
        char b = 'a';
        short c = 11;
        int res = a+b+c;
        System.out.println(res);

        // 强转
        int num1 = 130; // 四个字节
        byte num2 = (byte) num1; // 强转直接砍掉前24位
        System.out.println(num2); // -126

        // 类型面试题
        byte a1 = 3;
        byte a2 = 4;
        // byte a3 = a1+a2; // 有问题，因为转成int再计算
        byte a3 = 3+4; // 为啥没问题？？？java有常量机制，当javac编译的时候，就已经进行3+4运算，所以不会存变量，不会报错
    }
}
