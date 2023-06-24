package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class binarySearchFromIndToIndex {
    public static void main(String[] args) {
        int [] arr ={2,4,6,8,1,3,7,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.binarySearch(arr,0,3,1));
    }
}
