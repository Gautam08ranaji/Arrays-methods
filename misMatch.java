package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class misMatch {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2 [] = {1,2,3,3,5};

        System.out.println("Elements mismatched at  index : "+Arrays.mismatch(a1,a2));
    }
}
