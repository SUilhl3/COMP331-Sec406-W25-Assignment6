package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int sum;
        System.out.println("This code is used to mutiply three numbers together.");
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        System.out.println("Enter the thrid number: ");
        c = input.nextInt();
        sum = a*b;
        System.out.println("Your sum is: " + sum);

    }
}