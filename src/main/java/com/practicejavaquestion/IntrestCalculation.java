package com.practicejavaquestion;

import java.util.Scanner;

public class IntrestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        long principal = sc.nextLong();
        System.out.println("Enter the intrest rate");
        double rate = sc.nextDouble();
        System.out.println("Enter the period of time");
        int time = sc.nextInt();

        double si = getSi(principal,rate,time);
        System.out.println(si+ " is simple interest");
    }
    static double getSi(long principal, double rate, int time) {
        double si = (principal*rate*time)/100;
        return si;
    }
}
