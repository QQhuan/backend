package com.qquhuan.CollectionMap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("q");
        list.add("h");

        list.add(0, "0");
        list.set(0, "0-set");
        list.remove(1); // List接口的remove方法

        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        System.out.println("--------------------");
        // 正序遍历
        ListIterator<String> li = list.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("--------------------");
        // 倒序遍历
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
