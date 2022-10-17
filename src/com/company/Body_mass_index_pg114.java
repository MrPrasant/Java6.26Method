package com.company;
import java.util.Scanner;

class Body_mass_index_pg114 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    /*    System.out.println("We are here to Help you to know your BMI");
        System.out.println("Enter your weight in pounds");
        double weight= sc.nextDouble();
        System.out.println("Enter your Height in Inches");
        double height=sc.nextDouble();
        //we are now have to convert the weight into k.g from pounds
        double kgWeight= weight * 0.45359237;
        //now we have to convert the height into meters
        double mtrHeight= height * 0.0254;
        // to calculate the BMI we have to divide the KGWeight by the square of the height in meter
        double mtr_HeightSquare = mtrHeight * mtrHeight ;
        //In this step we are going to calculate BMI
        double bmi= kgWeight / mtr_HeightSquare ;
        System.out.println(bmi);

     */

        //In the final step we are going to give conditions in IF & ELSE statement


     /*   if (bmi < 18.5) {
            System.out.println("you are in underweight");
        }
        if ( 18.5<=bmi){
            if ( bmi < 25.0)
                System.out.println(" You are normal");
        }
        if (25.0<= bmi){
            if (bmi < 30.0)
                System.out.println("you are overweight");
        }
        if (30.0 <= bmi){
            System.out.println("you are Obese");
        }
     */

//  In this Que. we are going to calculate the perimeter of a triangle

        System.out.println("For calculate the perimeter of triangle, Please enter the Lengths of the edges in C.M below");

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

//   After taking the input we have to find the Perimeter by verify the input data's given by is valid or not
        if ( A + B > C && B + C > A && C + A > B ) {
                    System.out.println("Perimeter is " + (A + B + C) + " C.M");
        }
        else {

            System.out.println("Input Data is invalid");}
        }
            }
