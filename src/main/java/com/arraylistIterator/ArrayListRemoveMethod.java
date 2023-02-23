package com.arraylistIterator;

import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {


    ArrayList <Object> ar = new ArrayList<>();
    ar.add("Shubham");
    ar.add(1);
    ar.add("Tripathi");

    ar.remove(1);
       // System.out.println(ar);
        ar.add(1,27);
      //  System.out.println(ar);
        ar.add(1,"Tripathi");
        ar.add(2,27);
        System.out.println(ar);
}
}