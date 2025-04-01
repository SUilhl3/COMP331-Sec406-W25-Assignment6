package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int addSum;
        int multiSum;
        int subSum;
        System.out.println("This code is used to calculate the added, multiplied, and subtracted sums of three values the user inputs.");
        System.out.println("Please enter the first number: ");
        a = input.nextInt();
        System.out.println("Please enter the second number:");
        b = input.nextInt();
        System.out.println("Please enter the third number: ");
        c = input.nextInt();
        multiSum = a*b*c;
        addSum = a+b+c;
        subSum = a-b-c;
        System.out.println("The added sum is " + addSum);
        System.out.println("The multiplied sum is " + multiSum);
        System.out.println("The subtracted sum is " + subSum);
        System.out.println("Thank you for using this code!");

    }
}