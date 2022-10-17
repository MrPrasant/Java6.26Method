package com.company;
import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=(int)(Math.random() * 20);
        int number2=(int)(Math.random() * 20);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //Prompt the student to subtract the numbers
        System.out.println("What is " + number1 + "-" + number2 + "?");
        int answer= input.nextInt();
        int RealAnswer = (number1-number2);

        // grade the answer amd display the result
        if (number1 - number2 == answer ){
            System.out.println("You are correct");
        }
        else{
            System.out.println("your answer is wrong");
            System.out.println( "the answer of number1 - number2 is " + RealAnswer );
        }



        }
    }

