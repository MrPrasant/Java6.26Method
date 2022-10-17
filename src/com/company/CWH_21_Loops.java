package com.company;
import java.util.Scanner;
public class CWH_21_Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*  // Using While Loop!
        int a = 100;
        while (a<=200) {
            System.out.println(a);
            a++;
        }
        System.out.println("While loop is ended here!");
     */
     /*int sum = 0 , i = 1 ;
        while (i < 10){
            sum = sum + i ;
            i++;
        }
        System.out.println( "sum is " + sum );
      */
        // Creating a number quiz
/*      int number1 = (int)(Math.random() * 10 );
      int number2 = (int)(Math.random() * 10 );
      Scanner input = new Scanner(System.in);
        System.out.println("what is " + number1 + " + " + number2);
        int answer = input.nextInt();
        // creating the while loop for getting repeated quiz instructions
        while ( number1 + number2 != answer){
            System.out.println("Wrong answer. Try again " + "what is " + number1 + " + " + number2);
            answer = input.nextInt();
        }
        System.out.println("Correct answer. You got it");
         */

    /*    int number = (int) (Math.random()*101);
        System.out.println( "\nEnter your guess" );
        int guess = -1;
        while (guess != number) {
            guess = input.nextInt();
            if (guess == number)
                System.out.println("yes the number is " + number);
            else if (guess > number)
                System.out.println("your guess is too high");
            else
                System.out.println("your guess is too low");
        }
     */
/*      final int Number_of_Questions= 5 ;
        int correctCount = 0 ; // counting number of correct answers
        int count = 0; // counting the number of questions
        long startTime = System.currentTimeMillis();
        String output = " " ; //output id initially empty
        while ( count < Number_of_Questions) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            //if number2 is greater than number1 then swap it between
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // promoting to answer of the question
            System.out.println("What is " + number1 + "-" + number2 + " ?");
            int answer = input.nextInt();
            // Grade the answer & display the result
            if (number1 - number2 == answer) {
                System.out.println("you are correct");
                correctCount++;
            } else
                System.out.println("You are wrong.\n" + number1 + " - " + number2 +
                        " should be " + (number1 - number2));
            count++;
            output += "\n" + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }
            // get end time & test time
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime ;
            System.out.println( "Correct count is " + correctCount + "\n test time is " +
                    testTime/1000 +" Seconds \n" + output );
 */
        // We are now here to create a programme which calculate the sum of integers till the input is zero(0)
/*      System.out.println("Enter an integer (the input ends if it is 0)");
        int data = input.nextInt();
        // keep reading data until the input is zero
        int sum = 0;
        while ( data != 0 ){
            sum += data ;
            System.out.println("Enter an integer (the input ends if it is 0)");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
 */
 /*     int sum = 0;
        while (input.hasNext()){
            sum+= input.nextInt();
        }
        System.out.println("The sum is " + sum);
  */
//        int number, max;
//        number = input.nextInt(); max = number ;
//        while ( number != 0 ){
//            number = input.nextInt();
//            if (number > max )
//                max = number ;
//        }
//        System.out.println( "max is " + max );
//        System.out.println( "number is " + number);
//        for ( int a=1 ; a <=100;) {
//            System.out.println("Number is " + a );
//            a++;
//        }
//        int number , sum=0 ,count=0;
//            do{
//            System.out.println("enter the input No.");
//            number = input.nextInt();
//            sum += number;
//            count++;
//        }
//            while (count < 6 );
//        System.out.println("sum is"+sum );
//   Displaying Multiplication Table by taking user input
//        System.out.println(" enter the number of which table you want");
//        int t = input.nextInt();
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(t + "*" + i + "=" + t * i);
//        }
//   Displaying the 1-9 Multiplication table by using nested loop
//        System.out.println("    " + "Multiplication table");
//        System.out.print("    ");
//        for (int j =1; j <= 10 ; j++){
//            System.out.print("   " + j );
//        }
//        System.out.println("\n--------------------------------------------" );
//        for (int i=1; i<=10; i++){
//            System.out.print(i + " | ");
//            for ( int j=1; j<=10; j++ ){
//                System.out.printf("%4d" , i * j );
//            }
//            System.out.println();
//        }
//      Writing factorial of number 7
//        int n = 7;
//        int i = 1;
//        int factorial = 1;
//        while ( i<=7){
//            factorial *=i;
//            i++;
//        }
//        System.out.println( "factorial of the number is " + factorial);

//        int number = (int) (Math.random() * 101);
//        int guess=-1; //we cannot initialise guess to'0' because it could be the guessed number bt.(0- 100)
//        while (guess!=number) {
//            System.out.println("Enter your guess number between 0 - 100");
//            guess = input.nextInt();
//            if (guess > number) {
//                System.out.println("Guessed number is too high");
//            } else if (guess < number) {
//                System.out.println("guessed number is too low ");
//            } else {
//                System.out.println("Your guess is correct");
//            }
//        }
    // listing 5.5 if user entered 0 then loop terminate and shows the sum of all input values
//        System.out.println("Enter an input value rather than '0' (If 0 is entered then loop will exit)");
//        int number = input.nextInt();
//        int sum=0;
//        while (number!=0){
//            sum+=number;
//            System.out.println("Enter an input value rather than '0'");
//            number= input.nextInt();
//        }
//        System.out.println("The loop is terminated and the final sum of all numbers is "+sum);
    //converting the upper code to do while was as follows:-
//        int number, sum=0;
//        do {
//            System.out.println("Enter an input value rather than '0'");
//            number=input.nextInt();
//            sum+=number;
//        }while (number!=0);
//        System.out.println("The sum is "+sum );
    //
        int sum=0;
        int number=0;

        boolean found=false;
        while (number < 20 && number!=10 && number!=11){
            number++;
            sum+=number;
        }

    }
}


