package com.qquhuan.Sort;

import java.util.Arrays;

public class SortAlg {
    public static void main(String[] args) {
        int[] arr = new int[]{19, 24, 89, 78, 12, 4, 66};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 89;
        System.out.println(BinarySearch(arr, target));
    }

    private static void BubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void SelectSort(int[] arr) {
        int len = arr.length;
//        for(int i = 0; i < len; i++) {
//            int index = 0;
//            for(int j = 1; j < len - i; j++) {
//                if(arr[index] < arr[j]) {
//                    index = j;
//                }
//            }
//            if(index != len-i-1){
//                int temp = arr[index];
//                arr[index] = arr[len-i-1];
//                arr[len-i-1] = temp;
//            }
//        }

        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j < len; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // 二分查找
    private static int BinarySearch(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
