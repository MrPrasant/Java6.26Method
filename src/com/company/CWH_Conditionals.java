package com.company;
import java.util.Scanner;
public class CWH_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    System.out.println("If you want to know, that you are able to Drive or not enter your age");
    //    int Age = sc.nextInt();
    //    if (Age >= 18) {
    //        System.out.println("Yes you are able to Drive");
    //    } else {
    //        System.out.println("No you are not able to Drive");


            //page-112
    /*        int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println(" is even");
            }
            else if (number % 5 == 0){
            System.out.println(" is multiple of 5");
        }

     */
 //         Question No.1
    /*    byte  m1,m2,m3;
        System.out.println("Enter your marks in Math");
        m1= sc.nextByte();
        System.out.println("Enter your marks in Science");
        m2= sc.nextByte();
        System.out.println("enter your marks in Chemistry");
        m3= sc.nextByte();

        float avg= (m1+ m2+m3) / 3.0f ;
        System.out.println("your average mark is "+ avg );

        if (avg >=40 && m1>33 && m2>33 && m3>33){
            System.out.println("congrats you are passed");
        }
        else {
            System.out.println("sorry you are failed! Try again");
        }
        */
        //Question #2
         // recieve input
    /*    System.out.println("enter an integer");
        int number= sc.nextInt();

        if (number%2 == 0 && number%3==0){
            System.out.println(number +" is divisable by 2 & 3");
        }
        if (number%2==0|| number%3==0){
            System.out.println(number+ " is divisable by 2 or 3" );
        }
        if (number%2==0 ^ number%3==0){
            System.out.println(number+ " is divisable by 2 or 3, but not both");
        }
*/
        //Question 3
        //Calculating Tax

        System.out.println("Enter your income Per annum in Lakhs");
        int income = sc.nextInt();
        int tax = 0;

        if (income <= 250000 ){
            System.out.println("You are not an incokme tax payer");
        }
        else if (income > 250000 && income <= 500000){
            tax = (income - 250000) * 5/100 ;
        }
        else if ( income > 500000 && income <= 1000000 ){
            tax = (income - 250000) * 5/100 ;
            tax = (income -500000)* 20/100;
        }
        else if (income >1000000){
            tax = (income - 250000) * 5/100;
            tax = (income -500000)* 20/100;
            tax = (income -1000000) * 40/100;
        }

        System.out.println(" The total Taxable amount is "+tax);
        }

    }