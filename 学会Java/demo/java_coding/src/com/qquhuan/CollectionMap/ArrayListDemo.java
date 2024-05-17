package com.qquhuan.CollectionMap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);

        list.remove(1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(5);

        int a = list.get(0);
        System.out.println(a);
        list.set(0, 999);

        arr2.addAll(0, list);
        System.out.println(arr2);
        System.out.println(list);


        System.out.println(arr2.size());

        String[] str = new String[]{"11", "33"};
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str));
        System.out.println(strArr);
    }
}
