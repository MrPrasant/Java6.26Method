package com.company;
import java.util.Scanner;
public class Chaptre3_Exercise {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
// Que- 3.11 ( Finding the Days in the month which are taking by USer input)
/*        System.out.println("Enter the month in form of number");
        int month= Input.nextInt();
        System.out.println("Enter the year");
        int Year = Input.nextInt();
// After taking the input we are going to show the user his entered months total days.
        if (Year % 4 == 0 && month == 2 ){
            System.out.println( " its a leap year & The month February has 29 days");
        }
        switch (month){
            case 1:
                System.out.println("Month January has 31 Days");
                break;
            case 3:
                System.out.println("Month March has 31 Days");
                break;
            case 4:
                System.out.println("Month April has 30 days ");
                break;
            case 5:
                System.out.println("Month May Has 31 days");
                break;
            case 6:
                System.out.println("Month June has 31 Days");
                break;
            case 7:
                System.out.println("Month July has 31 Days");
                break;
            case 8:
                System.out.println("Month August has 30 days ");
                break;
            case 9:
                System.out.println("Month September Has 31 days");
                break;
            case 10:
                System.out.println("Month October has 31 Days");
                break;
            case 11:
                System.out.println("Month November has 30 days ");
                break;
            case 12:
                System.out.println("Month December Has 31 days");
                break;
        }
 */
/*
//  Que-3.21 ( Write a program that show the day name [Science: Day of the week])
        System.out.println(" Enter the Year ; e.g ...2012, 2013");
        int year = Input.nextInt();
        System.out.println("Enter the month ; e.g (1:january, 2:february...");
        int m = Input.nextInt();

        System.out.println( "Enter the Date/day of the month");
        int q =Input.nextInt();
//  We are now going to find the Century of the year as 'K' and 'J' for Year/100 .
        int j = year/100 ;
        int k = year % 100;
//  Now we are going to put the christian zeller's formula
        int h = ( q + 26* (m + 1 ) /10 + k + (k /4) + (j /4) + (5 * j) ) % 7 ;
//  Using Switch case method to show the output as day name
        switch (h){
            case 0:
                System.out.println("Your answer is Saturday");
                break;
            case 1:
                System.out.println("Your Answer is Sunday");
                break;
            case 2:
                System.out.println("Your answer is Monday");
                break;
            case 3:
                System.out.println("Your Answer is Tuesday");
                break;
            case 4:
                System.out.println("Your answer is Wednesday");
                break;
            case 5:
                System.out.println("Your Answer is Thursday");
                break;
            case 6:
                System.out.println("Your Answer is Friday");
                break;
        }
 */
//// Que-3.26 (Use the &&, ||, and ^ operators) Writing an program on this operators
//        System.out.println( " Enter an integer which is need to be divide");
//        int dividend = Input.nextInt();
//        System.out.println( "Enter the two divisor's by which you want divide the dividend");
//        int divisor1 = Input.nextInt();
//        int divisor2= Input.nextInt();
//// now we are going to use the logical operators
//        if ( dividend % divisor1 == 0 && dividend % divisor2 == 0 ) {
//            System.out.println("Dividend " + dividend + " is divisible by both " + divisor1 + " & " + divisor2);
//        }
//        if (dividend % divisor1 == 0 || dividend % divisor2 == 0 ){
//            System.out.println( "Dividend " + dividend + " is divisible by " + divisor1 + " or " + divisor2);
//        }
//        if (dividend % divisor1 == 0 ^ dividend % divisor2 == 0 ){
//            System.out.println("Dividend " + dividend + " is divisible by " + divisor1 + " or " + divisor2 + " but not both");
//        }
//        else{
//            System.out.println( " the given Dividend are not divisible by any of the divisors");
//        }

//        for (int i = 1; i<5; i++){
//            int j =0;
//            while (j<i){
//                System.out.print(j + "  " );
//                j++;
////            }
//            int i = 0;
//            while (i < 5) {
//                for (int j = i; j > 1; j--)
//                System.out.print(j + " ");
//                System.out.println("****");
//                i++;
//        }
//        int i = 5;
//        while (i >= 1) {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "xxx");
//                num *= 2;
//            }
//            System.out.println();
//            i--;
//        }
//        int i = 1;
//        do {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "G");
//                num += 2;
//            }
//            System.out.println();
//            i++;
//        } while (i <= 5);
    // Conversion of decimal to hexa-decimal
        System.out.print("Enter the Decimal:");
        int decimal = Input.nextInt();
    // Conversion begin
         String hex = "";
         while (decimal != 0) {
             int hexValue = decimal % 16;
             // Convert a decimal value to a hex digit
             char hexDigit = (0 <= hexValue && hexValue <= 9)?
                     (char)(hexValue + '0'): (char)(hexValue-10 + 'A');
             hex = hexDigit + hex;
             decimal = decimal / 16;
             }

         System.out.println("The hex number is " + hex);


    }
 }




