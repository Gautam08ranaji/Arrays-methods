package com.abc.arraysMethodsPractice;

import java.util.Arrays;
import java.util.Spliterator;

public class spliterator {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "durian", "elderberry"};

        Spliterator<String> spliterator = Arrays.spliterator(fruits);

        spliterator.forEachRemaining(System.out::println);


    }
}
