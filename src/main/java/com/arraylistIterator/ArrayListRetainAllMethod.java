package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListRetainAllMethod {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList(Arrays.asList("Shbuahm","Tripathi","Shubham",10,100,10));

         ar.retainAll(Collections.singleton(10));
        System.out.println(ar);
        System.out.println(ar.contains("Shubham"));

    }
}
