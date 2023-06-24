package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class sortFromTO {
    public static void main(String[] args) {
        int a1 []= {1,2,3,4,64,74,67,23,75,44,67,43};

        Arrays.sort(a1,5,8);
        System.out.println(Arrays.toString(a1));
    }
}
