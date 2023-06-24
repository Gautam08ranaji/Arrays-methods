package com.abc.arraysMethodsPractice;

import java.util.Arrays;


public class Stream {
    public static void main(String[] args) {
        String s1[] = {"Geeks","For","Geeks"};
        java.util.stream.Stream<String> stream = Arrays.stream(s1);
        stream.forEach(str->System.out.print(str+" "));

    }
}
