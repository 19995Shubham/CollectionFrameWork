package com.practicejavaquestion;

import java.util.Scanner;
import java.util.SortedMap;

public class MarksCalculation {
   /* WAP to read the 4 subject marks from the user and display the result.
    In any subject marks < 35 so fail; percentage> 80% so distinction,>60 first class,>50 2nd class.
     Otherwise just pass
    ALTERNATE 1: WITHOUT USING METHOD*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first subject mark");
        double firstSubject = sc.nextDouble();
        System.out.println("Enter the second subject mark");
        double secondSubject = sc.nextDouble();
        System.out.println("Enter the third subject mark");
        double thridSubject = sc.nextDouble();
        System.out.println("Enter the fourth subject mark");
        double fourthSubject = sc.nextDouble();

        if(firstSubject < 35 || secondSubject <35 || thridSubject < 35 || fourthSubject < 35){
            System.out.println("Student fail ");
        }
        else {
            double percentage = ((firstSubject+secondSubject+thridSubject+fourthSubject)/400)*100;

            if(percentage > 85){
                System.out.println("Distinction");
            } else if (percentage> 60) {
                System.out.println("First class");
            } else if (percentage> 50) {
                System.out.println("Second class");
            }else {
                System.out.println("Just passed");
            }
        }
    }
}
