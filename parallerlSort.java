package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class parallerlSort {
    public static void main(String[] args) {
        int [] a1 = {11,44,55,33,77,88};

        Arrays.parallelSort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
