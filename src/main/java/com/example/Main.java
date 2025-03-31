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
        System.out.println("This code is used to show the sum three numbers being added together as well as multiplied together.");
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        System.out.println("Enter the third number: ");
        c = input.nextInt();
        multiSum = a*b*c;
        addSum = a+4+c;
        System.out.println("Your added sum is: " + addSum);
        System.out.println("Your multiplied sum is " + multiSum);

    }
}