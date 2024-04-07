[toc]

# Calendar类

- 抽象类

- getInstance方法获取一个实例

- 三个常用方法：

  | 方法名 | 说明                       |
  | ------ | -------------------------- |
  | get    | 获取指定字段信息           |
  | set    | 设置日历，单个多个字段都行 |
  | add    | 指定字段加或减             |

```java
package com.qquhuan.DateTest;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        /*
        * 用getInstance获取当前时间的日历对象
        * */
        // 多态
        // Calendar是一个抽象类！！！
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        /*
        * get方法
        * */
        // get方法获取指定字段的信息，参数为静态常量
        int i = c.get(Calendar.MONTH); // 3，月份为0-11
        System.out.println(i);

        int d = c.get(Calendar.DATE);
        System.out.println(d); // 正常获取

        // 注意：周开始是————日
        int j = c.get(Calendar.DAY_OF_WEEK); // 3
        System.out.println(j);

        /*
        * set方法
        * */
        // set方法
        // eg: 设置时间2024.4.7 22:27:55
        c.set(2024, Calendar.APRIL, 7, 22, 27, 55);
        System.out.println(c.getTime());
        // 也可以单独设置某个字段
        c.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println(c.getTime());

        /*
        * add方法，制定某一字段，增加或者减少
        * */
        c.add(Calendar.MONTH, -5);
        System.out.println(c.getTime());
    }
}
```

