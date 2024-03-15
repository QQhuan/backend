package com.qquhuan.system;

public class SystemTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String s = "";

        for(int i = 1; i <= 100; i++){
            s += i;
        }

        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        // arraycopy
        int[] ages = new int[10];
        for(int i = 0; i < 10; i++) {
            ages[i] = i+1;
        }
        int[] ages2 = new int[10];
        System.arraycopy(ages, 0, ages2, 0, 10);
        for(int i = 0; i < ages2.length; i++) {
            System.out.println(ages2[i]);
        }

        System.exit(0);
    }
}
