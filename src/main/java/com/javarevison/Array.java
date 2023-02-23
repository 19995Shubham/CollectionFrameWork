package com.javarevison;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        System.out.println(args.length); // 0
/*
        int[] x = new int[2147483647];
        System.out.println(x );*/

        int [] y = {10,-39};
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y.length); // give the size of the array  final in the nature because string class is final

        String s  = "Shubham tripathi";
        System.out.println(s.length());  //16 length() used for the String variable
       // System.out.println(s.length);  compile time length used for the array size and final in the nature


        String[] ab = {"A","AA","AAA"};
        System.out.println(ab[1].length());// here length method give the length of the String of that index

    }
}
