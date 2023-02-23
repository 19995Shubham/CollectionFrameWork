package com.practicejavaquestion;

import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the radius");
        int radius = sc.nextInt();
        System.out.println("Enter the value of pie");
        double pie = sc.nextDouble();

        double area = pie * radius * radius;
        System.out.println("Area of circle"+ area);*/
        System.out.println("///////////////////////////////////////////////////////////////////////");
        //By using method
        double r1 = sc.nextDouble();
        area(r1);
    }
  static  double area(double r){
        double are = 3.14*r*r;
      System.out.println(are);
      return are;
    }
   /* static double ch(){
     double ar = 3.14*6*6;
        System.out.println(ar);
        return ch();
    }*/
}
