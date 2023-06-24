package com.abc.arraysMethodsPractice;

import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr1[] = { 10,19, 15, 22 };
        int intArr2[] = { 10, 20, 15, 22, 35 };

        String[] s1 = {"blue","orange","red","green"};
        String[] s2 = {"purple","orange","red","green"};
        String[] s3 = {"blue","orange","red","green"};

        System.out.println("integers on comparision "+ Arrays.compare(s1,s2));
        System.out.println("integers on comparision "+ Arrays.compare(s1,s3));

        System.out.println("integers on comparision "+ Arrays.compare(intArr,intArr1));
        System.out.println("integers on comparision "+ Arrays.compare(intArr,intArr2));

    }
}
