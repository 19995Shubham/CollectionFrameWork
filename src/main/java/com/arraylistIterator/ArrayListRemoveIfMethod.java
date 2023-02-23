package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        numbers.removeIf(num -> num%2 == 0);
       System.out.println(numbers);
        numbers.removeIf(num1 -> num1%2 != 0);
        System.out.println(numbers);
        System.out.println( numbers.contains(1));


    }
}
