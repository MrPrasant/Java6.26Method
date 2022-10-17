package com.company;
import java.util.Scanner;
public class _Palindrome_5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //writing program to find a string was actually a palindrome or not?
        //Taking input from the user
        System.out.println("enter the string below");
        String raw= input.nextLine();
        String converted="";
        int length= raw.length();
        int high = raw.length()-1;
        for (int i=high; i>=0; i--){
            converted += raw.charAt(i);
        }
        if (raw.equalsIgnoreCase(converted)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
