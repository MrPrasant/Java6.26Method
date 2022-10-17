package com.company;
import java.util.Scanner;
public class CWH_Practice_set {
    public static void main(String[] args) {
       // Question 1
        // int a = 48;
        //int b= 79;
        //int c = 86;
        //int sum = a+b+c;
        //System.out.println(sum);

        // question 2
        // float Math = 59;
        //float computer=75;
        //float Science=75;
        // float CGPA = (Math+computer+Science)/3;
        // System.out.println(CGPA);


      //  question3

        //System.out.println("What Is Your Name ?");
        //Scanner sc= new Scanner(System.in);
        //String name= sc.next();
       // System.out.println("Hello "  + name +  " Have a good day");

        //question4

     // double kilometers;
     //  System.out.println("Enter The Kilometer");
    //  Scanner sc= new Scanner(System.in);
    //  kilometers=sc.nextDouble();
    //  System.out.println("Kilometers Into Miles");
    //  double miles = kilometers/1.62;

//Question5
        Scanner Scan= new Scanner(System.in);
        System.out.println("Mark in Physics");
        int Physics = Scan.nextInt();
        System.out.println("mark in Math");
        int Math= Scan.nextInt();
        System.out.println("MArk In Hindi");
        int hindi = Scan.nextInt();
        System.out.println("marks in Chemistry");
        int Computer= Scan.nextInt();
        System.out.println("Marks in Viva");
        int Viva= Scan.nextInt();
        System.out.println("Total Percentage");
        float Percentage = ((Physics + Math + hindi + Computer + Viva)/500.0f)*100;
        System.out.println(Percentage);





    }
}
