package com.company;
import java.util.Scanner;
public class Count_of_Monetary_unit {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        //Entering the amount in dollar
        System.out.println("Enter The Amount");
        double Money= Sc.nextDouble();
        //converting of dollars into cents
        int TotalCents=(int) (Money*100);
        //calculating the cents to Dollars
        int TotalDollar= TotalCents / 100;
        int remainingCents= TotalCents % 100;
        //converting remaining cents to quarters
        int TotalQuarters= remainingCents / 25;
        int RemainingCents2= remainingCents % 25;
        //converting remainingCents2 to Dimes
        int TotalDimes= RemainingCents2 / 10;
        int RemainingCents3 = RemainingCents2 % 10;
        //converting RemainingCents3 to nickles
        int TotalNickles= RemainingCents3 / 5;
        int RemainingCents4=RemainingCents3 % 5;
        //The rest of Cents are now eligible for pennies
        int Pennies = RemainingCents4;
        System.out.println("Money " + Money + " is"  );
        System.out.println(+ TotalDollar +" Dollars");
        System.out.println(+ TotalQuarters +" Quarters");
        System.out.println(+ TotalDimes +" Dimes");
        System.out.println(+ TotalNickles +" nickles");
        System.out.println(+ Pennies + " Pennies");


    }
}
