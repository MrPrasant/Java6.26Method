package com.company;
import java.util.Scanner;
public interface Switchcase_code_V18 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your age");
        int age;
        age = Sc.nextInt();
       /* if(age>18){
            System.out.println("you are an adult now");
        }
        else if(age>12){
            System.out.println("you are a minor");
        }
        else if (age>5){
            System.out.println("you are a child");
        }
        else{
            System.out.println("You are Newborn ");
        }*/
        switch (age){
            case 19:
                System.out.println("you are an adult now");
                break;
            case 23:
                System.out.println( "You are going to be join in a job");
                break;
            case 60:
                System.out.println("You are going to be retired");
                break;
            default:
                System.out.println("Enjoy your life");

        }
        System.out.println("thanks for using my code");

    }
}
