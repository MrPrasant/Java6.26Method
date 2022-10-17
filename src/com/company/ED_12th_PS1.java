package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ED_12th_PS1 {
    public static void main(String[] args) {
        // Problem1= print a big java word with the characters J,A,V,A.
        //    String New=  ("       J,        A,         V,      V,      A");
        //    String new2= ("       J,      A   A,        V     V      A   A");
        //    String NAme3= ("  J    J,     AAAAAAA,        V   V      AAAAAAA");
        //    String Name4= ("   J  J,     A       A,         V       A       A ");
        //    System.out.println(New);
        //    System.out.println(new2);
        //    System.out.println(NAme3);
        //    System.out.println(Name4);
        //Problem 2= Create a Table with 3 columns and 5 rows
        //String row1=("a         a^2         a^3");
        //String row2=("1          1           1");
        //String row3=("2          2           3");
        //String row4=("4          5           6");
        //String row5=("8          8           8");
        //System.out.println(row1);
        //System.out.println(row2);
        //System.out.println(row3);
        //System.out.println(row4);
        //System.out.println(row5);

        //       //problem3= solving (9.5*4.5-2.5*3/45.5-3.5)
        //  System.out.println(((9.5f*4.5f)-(2.5f*3))/(45.5f-3.5f));

        //Problem 4= summation (+) a series of 1-9.
        //System.out.println(1+2+3+4+5+6+7+8+9);
        //problem 5=
        // double a = (4.0);
        // double b= (1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);
        // System.out.println((b)*a);

        // Problem=6 (find the area & perimeter of a rectangle with taking input from user)
        //System.out.println("Enter the Height and width of the rectangle for find out the area");
        //Scanner newsc= new Scanner(System.in);
        //System.out.println("Enter the height of the rectangle");
        //   float height=newsc.nextFloat();
        //  System.out.println("enter the Width of the rectangle");
        //  float width = newsc.nextFloat();
        //  System.out.println("Area of the rectangle is ");
        // System.out.println(height*width);

        //Problem 7
        //int totalNewBornInOneYear=(4505143);
        //int totalDeathInOneYear = (2425846);
        //int totalImmigrantsInONeYear=(700800);
        //int currentPopulation=(312032486);
        //so the total Population after 5 Years is
        //int totalNewbornInFiveYears= (5*totalNewBornInOneYear);
        //int totalImmigrantsInFiveYears=(5*totalImmigrantsInONeYear);
        // int totalDeathInFiveYear= (5*totalDeathInOneYear);
        //System.out.println((currentPopulation+totalNewbornInFiveYears+totalImmigrantsInFiveYears)-totalDeathInFiveYear);

        //Problem8
        //float DistanceTravelledInKM=38.4f;
        //float timeTakenInSec=6035.0f;
        //float DistanceTravelledIn1Sec=(DistanceTravelledInKM/timeTakenInSec);
        // so the Distance traveled in 1hour is=
        //float oneHourIntoSec=(60*60);
        //float DistanceTravelledIn1Hour=(DistanceTravelledIn1Sec*oneHourIntoSec);

        //To get the average speed we must divide the total distance with total time
        //float averageSpeedInOneSec= (DistanceTravelledIn1Hour/oneHourIntoSec);
        /* to get the average speed in 1 hour we must multiply the average speed in sec
         to total sec in one hour */
        //System.out.print("The average speed in One hour is =");
        //System.out.print(averageSpeedInOneSec*3600.0f);
        //System.out.println(" K.m/Hour");
        //double miles = 100;
        //final double Kilometers_per_mile=1.609;
        //double kilometers= (miles*Kilometers_per_mile);

        //System.out.println(kilometers);

        //System.out.println(Math.pow(5, 3));

        //System.out.println( 56 % 6);
        //int a = (2+100)% 7;
        //if (a==4) {
        //    System.out.println("Thursday");
    //}

        //System.out.println(Math.pow(2, 3.5));

        Scanner newScanner=new Scanner(System.in);
         int M = newScanner.nextInt();
         int N= newScanner.nextInt();
         int Final= (M*N);
        System.out.println(Math.pow(Final, 2));









    }
}
