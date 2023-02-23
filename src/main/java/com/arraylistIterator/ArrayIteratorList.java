package com.arraylistIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteratorList {
    public static void main(String[] args) {

        ArrayList <Integer> shu = new ArrayList<>();
        shu.add(103);
        shu.add(109);
        shu.add(100);

       Iterator<Integer> si = shu.iterator();

       while(si.hasNext())  //giving true value till the length
       {
          Integer sir = si.next();  //
           System.out.println(sir);
       }

       ArrayList <Object> ao = new ArrayList<>();
       ao.add("Shubham");
       ao.add("tripathi");
       ao.add(28);
       ao.add("O+");
       ao.add(8889521214l);
       ao.add("s.shubhamtripathi@gmail.com");
       ao.add("InterraIt");

        Iterator <Object> inte = ao.iterator();

        while(inte.hasNext())
        {
            System.out.println(inte.next());
        }



    }
}
