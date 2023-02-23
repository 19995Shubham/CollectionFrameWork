package com.arraylistIterator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSyncronizedMethod {

    public static void main(String[] args) {

        List <Object> syn = Collections.synchronizedList(new ArrayList<>());

        syn.add("Naveen");
        syn.add("Pawan");
        syn.add("MOhit");
        syn.add(5);
       // for add remove and other operaton we dont have explicit syncronize
        synchronized (syn)    // to fetch the data from the list we have to explicit syncronize
        {
            Iterator <Object> it = syn.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        CopyOnWriteArrayList <String> emlist = new CopyOnWriteArrayList<>();
        emlist.add("Shubham");
        emlist.add("Tripathi");

        System.out.println(emlist);  // here we dont have to explicit syncronize

        Iterator <String> iit = emlist.iterator();
        while (iit.hasNext())
        {
            System.out.println(iit.next());
        }


    }
}
