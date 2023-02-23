package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListCompareSort {

    public static void main(String[] args) {


        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "D", "C", "E"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        //Before compare always sort the arrays then compare
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        if (l1.equals(l2)) {
            System.out.println(true + " l1 equal to l2");
        } else if (l1.equals(l3)) {
            System.out.println(true + "l1 equal to l3");
        } else if (l2.equals(l3)) {
            System.out.println(true + "l2 equal to l2");
        } else {
            System.out.println(false + "Every condition is wrong");
        }


        //Remove additional element from the arrylist compare two
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));

        l4.removeAll(l5);//this remove all the duplicate element and only unique element remain int he l4 and D remain
        System.out.println(l4);

        l4.addAll(l5); // again this will add the remaining element in the l5 and give result as DABCE
        System.out.println(l4);


    }








}