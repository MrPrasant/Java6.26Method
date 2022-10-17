package com.company;
import java.util.Scanner;
public class new_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String m = "Mathematics";
        String c = "Computer Science";
        String i = "Information And Technology";
        System.out.print("Enter 2 characters for Major and Status:");
        String user = input.nextLine();  //taking the input

        char ch = Character.toUpperCase(user.charAt(0));
        int exp = user.charAt(1);
        // identifying the major and status by using (If-else) with switchCase
        if (ch == (char) 'M') {
            switch (exp) {
                case '1' -> System.out.println(m + " freshman");
                case '2' -> System.out.println(m + " sophomore");
                case '3' -> System.out.println(m + " Junior");
                case '4' -> System.out.println(m + " Senior");
            }
        }
            else if (ch == (char) 'C') {
            switch (exp) {
                case '1' -> System.out.println(c + " freshman");
                case '2' -> System.out.println(c + " sophomore");
                case '3' -> System.out.println(c + " Junior");
                case '4' -> System.out.println(c + " Senior");
            }
            }
            else if (ch == (char)'I'){
            switch (exp) {
                case '1' -> System.out.println(i + " freshman");
                case '2' -> System.out.println(i + " sophomore");
                case '3' -> System.out.println(i + " Junior");
                case '4' -> System.out.println(i + " Senior");
            }
            }
        else  {
                System.out.println("Invalid Input");
        }
    }
}