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
        System.out.println("This code is used to show the sum three numbers being added together as well as multiplied together.");
        int sum;
        System.out.println("This code is used to mutiply three numbers together.");
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        System.out.println("Enter the thrid number: ");
        c = input.nextInt();
        multiSum = a*b*c;
        addSum = a+c-b;
        subSum = b-a+c;
        System.out.println("Your added sum is: " + addSum);
        System.out.println("Your multiplied sum is " + multiSum);
        System.out.println("Your subtracted sum is " + multiSum);
        sum = a*b;
        System.out.println("Your sum is: " + sum);


    }
}