package com.arraylistIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListCloneMethod {

    public static void main(String[] args) {
        ArrayList <String> ar = new ArrayList();
        ar.add("Java");
        ar.add("Phython");
        ar.add("ruby");
        ar.add("c#");
        ar.add("c++");
        ar.add("javaScript");

     ArrayList <String> arrayClone  =  (ArrayList<String>)ar.clone();
        System.out.println(arrayClone);
    }
}
