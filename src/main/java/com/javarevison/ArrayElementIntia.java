package com.javarevison;

import java.util.Arrays;

public class ArrayElementIntia {

    public static void main(String[] args) {

        Number[] n = new Number[10];
        n[0] = new Integer(10);
        n[1] = new Byte((byte)100);
       // n[2] = new String("main");
        n[3] = new Short((short) 20);
     //   n[4] = new Character('a');
        n[5] = new Double((double) 34.5);
        System.out.println(java.util.Arrays.toString(n));
        System.out.println(Arrays.toString(n));

     /*   Object ob = new Object[10];
        ob[0] = new String("Shubam");
        ob[1] = new Integer(10);
        ob[2] = new Double(34.5);
        System.out.println(ob);*/

        Object ob = new Object[10];
        ((Object[]) ob)[0] = new String("Shubam");
        ((Object[]) ob)[1] = new Integer(10);
        ((Object[]) ob)[2] = new Double(34.5);
        System.out.println(java.util.Arrays.toString((Object[]) ob));

    }
}
