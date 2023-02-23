package com.practicejavaquestion;

import java.util.Scanner;

public class AreaOfSquare {

    public double sideSquare(double side){
        double si = side * side;
        System.out.println(si);
        return si;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side");  // area of square side * side
        double s = sc.nextDouble();

        AreaOfSquare as = new AreaOfSquare();
        double squareSide = as.sideSquare(s);
        System.out.println(squareSide);

    }
}
