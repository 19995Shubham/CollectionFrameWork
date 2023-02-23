package com.arraylistIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList01 {
    public static <Strig> void main(String[] args) {

        //defalut generic
        ArrayList <Object> ar = new ArrayList();
        ar.add("main");
        ar.add(100);
        ar.add('t');
        ar.add("testing");
        System.out.println(ar.get(3));   //to get specific index value
        System.out.println(ar);
        System.out.println(ar.size());  // length of the arraylist
        System.out.println(ar.size()-1 ); // last index of the arraylist

        ArrayList <String> s = new ArrayList<>();   //only String data can be added by using wrapper class
        s.add("Shubham");
        s.add("tripathi");
        s.add("Selenium with IDE");

        System.out.println(s.get(2));
        System.out.print(s.get(0));
        System.out.println(s.get(1));
        System.out.println(s);


        //ways to itterate the value from the arraylist
        ArrayList <String> name = new ArrayList<String>();
        name.add("Shubam");
        name.add("Mohit");
        name.add("Shivam");
        name.add("Rohit");

        //using for loop
        for (int i = 0; i <= name.size()-1; i++)
        {
            System.out.println(name.get(i));

        }
        //using for each loop
        for(Object i : name)     //the value stored in the string so use string or object in the return type
        {
            System.out.println(i);
        }
        //using lambda expression
        System.out.println("lambda expression///////////////////");
        name.stream().forEach(System.out::println);

        //iterator
        System.out.println("iterator method /////////////////////////////////");
        Iterator<String> it = name.iterator();

        while(it.hasNext())
            System.out.println(it.next());

          //another method to fetch the store the data and featch
        ArrayList <Integer> asl = new ArrayList<>(Arrays.asList(100,200,203,400));
        System.out.println("another method to store and fetch the vlaue " + asl);

        ArrayList <Object> aslo = new ArrayList<>(Arrays.asList("java",100,'j',"phthon"));
        System.out.println(aslo);

      //  addAll method use in combine two arraylist
        ArrayList <Object> ar1 = new   ArrayList<>();
        ar1.add("Shubham");
        ar1.add("tripathi");
        ar1.add("InterraIt");
        ar.add(5);

        ArrayList <Object> ar2 = new ArrayList<>();
        ar2.add("s");
        ar2.add("position");

      //  ar1.addAll(ar2);
       // System.out.println(ar1);

        //add two arraylist by index number
        ar1.addAll(2,ar2);
        System.out.println(ar1);

    }
}