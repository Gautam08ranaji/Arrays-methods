package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class copyOf {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(a1));

        System.out.println(Arrays.toString(Arrays.copyOf(a1, 10)));


    }
}
