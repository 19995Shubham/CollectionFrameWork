package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraListTOArrayConversion {

    public static void main(String[] args) {

        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList("Shubham","Shivam","Mohit","Ritik","Piyal",5));


        //System.out.println(arr);
         Object name[] = arr.toArray();
        System.out.println(Arrays.toString(name));
        //System.out.println(Arrays.asList(name)); this also return the name

        for (Object o : arr)
        {
            System.out.println(o);
        }
        //we can use both method to fetch the vlaue from the array and return type of the name is object so it will re
        // return all data type in the array also
        for (int i = 0; i<= name.length-1; i++)
        {
            System.out.println(name[i]);
        }


        ArrayList <Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));


        Object num[] = ar1.toArray();
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.asList(num));

        for(Object n : num)
        {
            System.out.println(n);
        }
        for (int j = 0; j<= num.length; j++)
        {
            System.out.println(j);  //if print with array of j then in condition it should take length-1
        }



    }
}
