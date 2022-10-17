package com.company;

import java.util.Scanner;

public class P_05_takingInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the decimal number");
        float a1 = sc.nextFloat();
        System.out.println("enter the second number");
        int b = sc.nextByte();
        System.out.println("enter the second decimal");
        float b1= sc.nextFloat();
        int sum = a+b;
        float decimalSum = a1+b1;
        System.out.println("the sum of these numbers and decimal numbers are");
        System.out.println(sum);
        System.out.println(decimalSum);
    }
}
