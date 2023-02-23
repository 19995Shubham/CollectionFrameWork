package com.practicejavaquestion;

 class AreaOfSquare3_3{

     public void square(double side){
         double si = side*side;
         System.out.println(si);
     }
 }
public class AreaOfSquare3 {

    private double square(double side){
        return side*side;
    }

    public static void main(String[] args) {
       double s = 9.5;
        AreaOfSquare3 as3 = new AreaOfSquare3();
        double ss = as3.square(s);
        System.out.println(ss);

        AreaOfSquare3_3 as3_3 = new AreaOfSquare3_3();
        as3_3.square(7);
    }

}
