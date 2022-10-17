package com.company;
import java.util.Scanner;
public class Method6_26_ {
    static Scanner sc = new Scanner(System.in);
    //6.26- (Palindromic prime)
    public static void main(String[] args) {
        System.out.println("Enter the starting number");
        int start= sc.nextInt();
        System.out.println("Enter the end number");
        int end = sc.nextInt();
        printPrime(start,end);
    }
    public static void printPrime(int start, int end) {
        int count = 1;
        int numPerLine = 10;
        while (start <= end) {
            boolean isPrime = true;
            for (int factor = 2; factor <= (start / 2); factor++) {
                if (start % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (isPalindrome(start)) {
                    count++;
                    if (count % numPerLine != 0) {
                        System.out.print(start + " ");
                    } else {
                        System.out.println(start + " ");
                    }
                }
            }
            start++;
        }
    }
    public static boolean isPalindrome(int num) {
        String number= num + "";
        String str ="";
        for (int i = 0; i<number.length();i++) {
            str+=number.charAt(i);
        }
        return number.equalsIgnoreCase(str);
    }

}
