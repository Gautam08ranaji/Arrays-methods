package com.abc.arraysMethodsPractice;

import java.util.Arrays;
import java.util.List;

public class asList {
    public static void main(String[] args) {
       String[] s1 = {"yellow","green","orange"};
        List<String> colourList = Arrays.asList(s1);
        colourList.set(0,"blue");
//        colourList.add(1,"purple");
//        colourList.set(3,"purbple");
        System.out.println(colourList.contains("green"));
        System.out.println(colourList.get(2));
        System.out.println(colourList.indexOf("orange"));

        System.out.println(colourList);



//        Integer [] a1 = {1,2,3,4};
//        List<Integer> integerList = Arrays.asList(a1);
//        System.out.println(integerList);
//
//        int  [] a2 = {11,22,33,44};
//        List<int[]> intList = Arrays.asList(a2);
//        System.out.println(intList);


    }
}
