package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayContainsMethod {

    public static void main(String[] args) {
        //Contains return  boolean result

        ArrayList ar = new ArrayList(Arrays.asList("Phython",100));
        System.out.println(ar.contains("Phython"));

        ArrayList <String> ar1 = new ArrayList();
        ar1.add("Selenium");
        ar1.add("Java");
        ar1.add(String.valueOf(100));  //Stirng.vlaueOf() is method to conver non string type to string type in the arraylist

        if(ar1.contains("100"))
        {
            System.out.println("yes contain."+ar1.contains("100"));
        }
        else
        {
            System.out.println("No not contain. "+ ar1.contains(100));
        }

        System.out.println(ar1.indexOf("Java")>2);
        System.out.println(ar1.indexOf("Selenium"));
        System.out.println(ar1.indexOf(100 + "if variable not present in the list then return -1 "));



        ArrayList <String> ar2 = new ArrayList<String>();
        ar2.add("Shubham");
        ar2.add("Tripathi");
        ar2.add("Interra");
        ar2.add("Kolkata");

        System.out.println( ar2.lastIndexOf("Kolkata"));  //give index no of the variable;
         int i = ar2.lastIndexOf("Interra");  // i is the indext number of the Interra and replace that ind
        //index with IT in the place of interra
        ar2.add(i,"IT");
        System.out.println(ar2.get(3));
        System.out.println(ar2.get(2));
        System.out.println(ar2.contains("IT"));
        System.out.println(ar2.size());
        System.out.println(ar2);

    }
}
