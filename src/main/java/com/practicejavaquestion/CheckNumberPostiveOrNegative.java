package com.practicejavaquestion;

import java.util.Scanner;

public class CheckNumberPostiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number >= 0)
        {
            System.out.println("Number is postive "+number);
        }
        else {
            System.out.println("Number is negative "+number);
        }
    }
}
