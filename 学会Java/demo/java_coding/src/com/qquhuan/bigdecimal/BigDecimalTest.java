package com.qquhuan.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        // 解决小数出现的不精确问题
        BigDecimal one = new BigDecimal("0.1"); // 不推荐输入double，应为不准确
        BigDecimal two = new BigDecimal("0.2");

        System.out.println(one.add(two));

        BigDecimal o = BigDecimal.valueOf(10.0);
        BigDecimal t = BigDecimal.valueOf(3.0);

        System.out.println(o.add(t));

        // 小数点除不尽的情况
        System.out.println(o.divide(t, 2, RoundingMode.HALF_UP)); // 四舍五入
        System.out.println(o.divide(t, 2, RoundingMode.UP)); // 进一
        System.out.println(o.divide(t, 2, RoundingMode.DOWN)); // 都不要
    }
}
