package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class fill {
    public static void main(String[] args) {
        int [] a1 = new int[5];
        System.out.println(Arrays.toString(a1));

        Arrays.fill(a1,5);
        System.out.println(Arrays.toString(a1));

        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.fill(intArr,100);
        System.out.println(Arrays.toString(intArr));
    }
}
