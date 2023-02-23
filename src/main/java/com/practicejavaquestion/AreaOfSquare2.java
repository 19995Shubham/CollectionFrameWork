package com.practicejavaquestion;

public class AreaOfSquare2 {

    double n = 8;
    public double sideSqaure(double side){

        double ss = side*side;
        System.out.println(ss);
        return ss;
    }

    public static void main(String[] args) {
      double ns = 9;
        AreaOfSquare2 as1 = new AreaOfSquare2();
        as1.sideSqaure(as1.n);
      double localVariable =  as1.sideSqaure(ns);
      System.out.println(localVariable);


    }
}
