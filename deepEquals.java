package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class deepEquals {
    public static void main(String[] args) {
        int a1[][] = {{1,2,3,4,5},{2,3,4}};
        int a2[][] = {{1,2,3,4,5},{2,3,4}};

        System.out.println(Arrays.deepEquals(a1,a2));
    }
}
