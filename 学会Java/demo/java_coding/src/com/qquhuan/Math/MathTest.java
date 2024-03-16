package com.qquhuan.Math;

public class MathTest {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(-12.6)); // 12.6
        // 向上取整
        System.out.println(Math.ceil(12.0)); // 12.0
        System.out.println(Math.ceil(-12.6)); // -12.0

        // 向下取整
        System.out.println(Math.floor(12.6)); // 12.0
        System.out.println(Math.floor(-12.6)); // -13.0

        // 四舍五入
        System.out.println(Math.round(12.6)); // 13
        System.out.println(Math.round(12.4)); // 12
        System.out.println(Math.round(-12.4)); // -12
        System.out.println(Math.round(-12.5)); // -12
        System.out.println(Math.round(-12.50001)); // -12,跨过了5这个边界，更靠近-13了！！！

        // max min
        System.out.println(Math.max(1, 12)); // 只接受两个参数
        System.out.println(Math.min(-12.50001, 12)); // 只接受两个参数
        System.out.println(Math.round(-12.50001)); // -12,跨过了5这个边界，更靠近-13了！！！

        // random
        System.out.println(Math.random());

        // pow
        System.out.println(Math.pow(3, 2)); // 返回double
    }
}
