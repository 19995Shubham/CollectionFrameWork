package com.practicejavaquestion;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int leapYear = sc.nextInt();

        if(leapYear%400 == 0)
        {
            System.out.println("this is a leap year");
        }
        else if (leapYear%4 == 0 && leapYear%100 != 0){
            System.out.println("this is leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
