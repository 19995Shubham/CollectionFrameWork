package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSublistMethod {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> sublist = new ArrayList<>(numbers.subList(2,6));
        System.out.println(sublist);


        //ArrayList <Object> ar = new ArrayList<Object>(Arrays.asList("Shubham","Tripathi",27,"Interra",3.5f,"automation"));

       // ArrayList<Object> sublist1 = new ArrayList<Object>(ar.subList("Tripathi",3.5f));



        ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> subList = new ArrayList<>(ar1.subList(2,7));

        System.out.println(subList);


    }
}
