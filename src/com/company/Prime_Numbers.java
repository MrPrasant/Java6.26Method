package com.company;
import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //let the user enter how many prime numbers he wants
//        System.out.print("enter how many prime numbers you want: ");
//         final int NUMBER_OF_PRIMES = sc.nextInt();
//         final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
//         int count = 0; // Count the number of prime numbers
//         int number = 2; // A number to be tested for primeness
//
//         System.out.println("The first " + NUMBER_OF_PRIMES + " prime numbers are \n");
//
//         // Repeatedly find prime numbers
//         while (count < NUMBER_OF_PRIMES) {
//             // Assume the number is prime
//             boolean isPrime = true; // Is the current number prime?
//
//             // Test whether number is prime
//             for (int divisor = 2; divisor <= number / 2; divisor++) {
//                 if (number % divisor == 0) { // If true, number is not prime
//                     isPrime = false; // Set isPrime to false
//                     break; // Exit the for loop
//                     }
//                 }
//             // Display the prime number and increase the count
//             if (isPrime) {
//                 count++; // Increase the count
//             }
//             // Check if the next number is prime
//             number++;
//             }

        long n= sc.nextLong();
        long r;
        int count=0;
        while (n>0){
            r = n%10 ;
            n= n/10;
            System.out.println(r);
            count++;
        }
        System.out.print(count);
    }
}