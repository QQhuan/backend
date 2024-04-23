package com.qquhuan.CollectionMap;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    /*
    * 1. boolean add
    *
    * */

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("qh");
        c.add("OK");

        System.out.println(c);

        c.clear();

        System.out.println(c);

        System.out.println(c.isEmpty());

        c.add("OK");
        System.out.println(c.contains("OK"));

        c.remove("OK");

        System.out.println(c);

        System.out.println(c.size());
    }
}
