package com.arraylistIterator;

import java.util.ArrayList;

public class ArrayListLastIndexOFMethod {
    public static void main(String[] args) {


    ArrayList <String> ar = new ArrayList<>();
    ar.add("Shubham");
    ar.add("Tripathi");
    ar.add("Interrra");
    ar.add("It");

        System.out.println(ar.lastIndexOf("It"));  //3
        int i = ar.lastIndexOf("It");
        ar.add(i, "Company");

        for(int j = 0; j< ar.size(); j++)
        {
            System.out.println(ar.get(j));

        }



}
}