package com.javarevison;

import java.util.Arrays;

public class AnnonymousArray {

    public static void main(String[] args) {

     sum(new int[]{10,20,30});
     int[] z =  sum1(new int[]{20,3,3,4}); // now this is not annonymous;
    }

    static void sum(int[] x){

        int total = 0;
        for(int x1: x) {
            total = total+x1;
        }
        System.out.println("The sum is : "+total);
        }

        ///////////////////////////////////////////////////////////////


    static int[] sum1(int[] x){
        int total = 0;
        for (int y:x) {
            total = total+y;
        }
       System.out.println(total);
        return x;
    }

    }

