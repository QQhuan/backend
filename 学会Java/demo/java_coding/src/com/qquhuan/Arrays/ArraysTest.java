package com.qquhuan.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.equals(arr, arr2));

        System.out.println(Arrays.binarySearch(arr, 5)); // 必须保证数组是有序地
        System.out.println(Arrays.binarySearch(arr, 6)); // 找不到，返回(-(插入点位置)-1)，期望返回相关插入点的信息

        arr[0] = 99;
        Arrays.sort(arr); // 排序
        System.out.println(Arrays.toString(arr));
    }
}
