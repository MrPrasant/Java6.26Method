package com.company;

import java.util.Scanner;

public class Method_Practise {
    //Scanner sc= new Scanner(System.in);

//    public static int max (int num1, int num2) {
//        int result=num1;
//        if (num1<num2){
//            result=num2;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        int i = input.nextInt();
//        int j = input.nextInt();
//        int k=max(i,j);
//        System.out.println("The biggest number is "+k);
//    }

//    public static double xMethod (double num1 , double num2){
//        double answer= num1+num2;
//        return answer;
//    }
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        double a= input.nextDouble() ;
//        double b = input.nextDouble();
//        System.out.println(xMethod(a, b));
//    }
//    public static void main(String[] args) {
//     int i = 1;
//     while(i<=6){
//         method1(i,2);
//         i++;
//        }
//    }
//    public static void method1 ( int i,int num){
//        for (int j = 1; j<=i; j++){
//            System.out.println(num+" ");
//            num*=2;
//        }
//        System.out.println();
//    }
    //Modularizing the code
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("TO find the greatest common divisor enter the numbers below: ");
//        int num1= sc.nextInt();
//        int num2= sc.nextInt();
//        System.out.println("the greatest common divisor is "+gcd(num1,num2));
//    }
//    public static int gcd(int n1, int n2){
//        int gcd=1; //staring with 1 as gcd
//        int k=2;   //checking from 2
//        while (k<=n1 && k<=n2){
//            if (n1%k==0 && n2%k==0){
//                gcd=k;
//            }
//            k++;
//        }
//        return gcd;
//    }
    //finding the first 50 prime numbers and print 10 numbers on each line
//    public static void main(String[] args) {
//        int number=1;
//        System.out.println("The first 50 prime numbers are:-");
//        printPrime(50);                    //using the printPrime method to print the primes
//    }
//    public static void printPrime(int totalPrimes) {
//        int numbers_Per_Line = 10;
//        int number = 2;                       //start the number from 2
//        int count = 0;
//        while (count < totalPrimes) {
//            if (isPrime(number)) {          //checking the primeness by isPrime method
//                count++;                   //count increase when each prime number founded
//                if (count % numbers_Per_Line==0){
//                    System.out.printf("%5d\n", number);   //print number with new line when count become 10s multiple
//                }
//                if (count % numbers_Per_Line!=0){
//                    System.out.printf("%5d", number);
//                }
//            }
//            number++;
//        }
//    }
//    public static boolean isPrime(int n){
//        for (int divisor = 2; divisor <= n / 2; divisor++) {   //checking primeness
//            if (n % divisor == 0){
//                return false;
//            }                                 //false if number is prime and vice-versa
//        }
//        return true;
//    }
    //hexadecimal to decimal value
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the hexadecimal number below to convert it to decimal ");
//    String hexadecimal= sc.nextLine();
//    System.out.print(hexToDecimal(hexadecimal.toUpperCase()));
//    }
//    public static int hexToDecimal(String hex){
//    int decimalValue=0;
//    for (int i = 0; i< hex.length();i++){
//        char hexChar= hex.charAt(i);
//        decimalValue= decimalValue * 16 + charToInt(hexChar);
//        }
//    return decimalValue;
//    }
//    public static int charToInt(char ch ){
//    if (ch>='A' && ch<='F'){
//        return 10 + ch-'A';
//    }
//    else
//        return ch-'0';
//    }
//}
    public static void main(String[] args) {
        System.out.println(getRandomCharacter());
    }
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() *(ch2-ch1 + 1));
    }
    public static char getRandomLowercaseCharacter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUppercaseCharacter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}










