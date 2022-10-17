package com.company;
import java.util.Scanner;
public class Loops_Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //5.5(Conversion from kilograms to pounds and pounds to kilograms)
//        System.out.printf("%3s\t%3s\t|\t%3s\t%3s\n","kilogram","Pounds","Pounds","kilogram");
//
//        for (int kilogram=1,pound=20;kilogram<=199 && pound<=515;){
//            double pounds=kilogram*2.2;
//            double kilograms = pound/2.2;
//            System.out.printf("%3d\t\t\t%.2f\t|\t%3d\t\t%.2f\n",kilogram,pounds,pound,kilograms);
//            kilogram+=2;
//            pound+=5;
//        }
        //5.17- Let the user enter a int between 1-15 and display a pyramid
//        System.out.println("Enter a int between 1-15 to display the pyramid");
//        int num = input.nextInt();
//        //creating space in each row
//        for (int row=1;row<=num;row++){
//            for (int space=num-row;space>=1;space--){
//                System.out.print("  ");
//            }
//            for (int dec=row;dec>1;dec--){
//                System.out.print(dec+" ");
//            }
//            for (int acc=1;acc<=row;acc++){
//                System.out.print(acc+" ");
//            }
//            System.out.println();
//        }
        //5.18- display a right-angled pyramid of 6 rows with numbers
        //pattern'A'
//        for (int row=1; row<=6;row++){
//            for (int num=1;num<=row;num++){
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
//    //pattern'B'
//        for (int row=6; row>=1;row--){
//            for (int num=1;num<=row;num++){
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
        //pattern'C'
//        int numberOfLines=6;
//        for (int row=1; row <=numberOfLines ;row++) {
//            for ( int space=numberOfLines-row;space>=1;space--){
//                System.out.print("  ");
//            }
//            for (int num =row; num >= 1; num--) {
//                System.out.print( " "+num);
//            }
//            System.out.println();

        // Pattern'D'
//        for (int rows = 0; rows < 6; rows++) {				// Print rows
//            for (int ws = 0; ws < rows; ws++) {				// Print white space
//                System.out.print("  ");
//            }
//            for (int col = 0; col < 6 - rows; col++) {	// Print numbers
//                System.out.print((col + 1) + " ");
//            }
//            System.out.println();
//        }
//

        //5.19
//        int endSpace=7;
//        int startRight=0;
//        for (int num=1; num<=128;num+=num){
//            for (int space =0; space<=endSpace;space++){
//                System.out.print("    ");
//            }
//            for (int i=1;i<=num;i+=i){
//                System.out.printf("%4d",i);
//            }
//            for (int d=startRight; d>0; d/=2){
//                System.out.printf("%4d",d);
//            }
//            System.out.println();
//            startRight=num;
//            endSpace--;
//        }
        // 5.20- Display the prime numbers between 1-1000 and display 8 prime number in each line
//        int number=1;                //starting from 1
//        int number_Per_Line=8;        //per line 8 numbers
//        int count=0;                 // count increase bt 1 if a prime number found
//        while (number<=1000){
//            boolean isPrime=true;                //is the current number is prime ?
//            for (int divisior=2;divisior<=number/2;divisior++) {   //checking primeness
//                if (number % divisior == 0) {          //assign isPrime false if this statement is true
//                    isPrime = false;
//                    break;                                //break the for loop
//                }
//            }
//            if (isPrime) {                            //if isPrime is true then Count++ & display the number
//                count++;
//                if (count % number_Per_Line == 0) {
//                    System.out.println(number);       //printing number with new line in advance
//                }
//                else
//                    System.out.print(number+" ");
//            }
//        number++;                                    //increase number by 1 in every iteration of while loop
//        }
    // 5.21- Compute monthly Payment and total payment of a loan with 5%-8% interest rate
//        System.out.println("Enter the Total Loan Amount");
//        double loan= input.nextDouble();                 //let the user enter total loan amount
//        System.out.println("Enter total Time in years e.g-3");
//        double Year= input.nextDouble();                //getting the total time
//        double initialInterest=5.000;                 //initial interest
//        System.out.println("Interest rate(%)\t\tMonthly Payment\t\tTotal Payment ");   //display 1st line
//        for (double incrementInt=0.125;initialInterest<=8.000;initialInterest+=incrementInt){
//            double monthlyIntrstRate= initialInterest/1200;
//            double monthlyPayment= loan*monthlyIntrstRate/(1-1/
//                     Math.pow(1+monthlyIntrstRate,Year*12));     //calculating monthly payment (ref-listing 2.9)
//            double annulPayment= monthlyPayment* Year*12;
//            System.out.printf("%4.3f\t\t\t\t%6.2f\t\t\t\t%7.2f\n",
//                    initialInterest,monthlyPayment,annulPayment);   //Display the result
//        }
        
        //5.27-Write a program that displays all the leap years, 10 per line from 101-2100
//        int yearsPerLine=10;
//        int count=0;
//        boolean isLeap=false;
//        for (int start=101; start<=2100;start++){
//            if (start%4==0) {
//                System.out.print(start+ " ");
//                count++;
//            }
//            else{
//                continue;
//            }
//            if (count%10==0){
//                System.out.println();
//            }
//        }

//        System.out.print("Enter the monthly Deposit amount:");
//        double deposit=input.nextDouble();
//        System.out.print("Enter the annual interest rate in %:");
//        double interest=input.nextDouble();
//        System.out.print("Total time in months:");
//        double time=input.nextDouble();
//        double monthlyInterest= (interest/100) / time;
//        double totalAmount=0 , onlyInt;
//        for (int i = 1; i<=time;i++){
//            totalAmount+=deposit;
//            onlyInt= totalAmount*monthlyInterest;
//            totalAmount+=onlyInt;
//            System.out.printf("The total value for %1d Month is:%2.3f\n",i,totalAmount);
//        }
//        boolean isMatch=false;
//        int ticketDigit1 = (int) (Math.random()* 9);
//        int ticketDigit2 = (int) (Math.random()* 9);
//        System.out.print("Enter a 2 digit guess number for WInning the lottery:");
//        int guess= input.nextInt();
//        int guessDigit1=guess/10;
//        int guessDigit2=guess%10;
//        if (ticketDigit1==ticketDigit2){
//            isMatch=true;
//        }
//       while (isMatch){
//           ticketDigit2 = (int) ((Math.random()*10)-1);
//           if (ticketDigit1!=ticketDigit2){
//               isMatch=false;
//           }
//       }
//       if (ticketDigit1==guessDigit1&&ticketDigit2==guessDigit2){
//           System.out.println("Exact Match You win $5000\n"+" lottery number is "+ticketDigit1+ticketDigit2);
//       }
//       else if (ticketDigit1==guessDigit2&&ticketDigit2==guessDigit1){
//           System.out.println("Match All the Digits, You win $3000\n"+" lottery number is "+ticketDigit1+ticketDigit2);
//       }
//       else if (ticketDigit1==guessDigit1
//            ||ticketDigit1==guessDigit2
//            ||ticketDigit2==guessDigit2
//            ||ticketDigit2==guessDigit1){
//           System.out.println("Match only 1 character, You win $1000\n"+" lottery number is "+ticketDigit1+ticketDigit2);
//       }
//       else {
//           System.out.println("No match, better luck next time\n"+" lottery number is "+ticketDigit1+ticketDigit2);
//       }
    //5.33
        //(Perfect number)
//        int number=6;
//        while (number<=10000){
//            int total;
//            int divisor= number-1;
//            for (total=0; divisor> 0;divisor--){
//                if (number % divisor==0){
//                    total+=divisor;
//                }
//            }
//            if (total==number){
//                System.out.println(total+"  "+number);
//            }
//            number++;
//        }
    //5.34- Build Rock, Paper, Scissor game and play until 2 wins are happen by user/Comp
//        int winC=0,winU=0;
//        while (winC<2 && winU<2){
//            System.out.println("press 1 for Rock, 2 for Paper & 3 for Scissor");
//            int user=input.nextInt();
//            int comp=(int)(Math.random()*3)+1;
//            if (user==1&&comp==3||user==2&&comp==1||user==3&&comp==2){
//                System.out.println("This round won by You" + " because the computer entered ->"+comp);
//                winU++;
//            }
//            else if (user==comp){
//                System.out.println("Match is drawn");
//            }
//            else {
//                System.out.println(" This round is won by Computer"+ " because the computer entered-> "+comp);
//                winC++;
//            }
//        }
//        if (winC==2){
//            System.out.println("Computer win the game");
//        }
//        else {
//            System.out.println("You win this game");
//        }
    //5.36- Checking ISBN-10 (Exercise-3.9)
//        System.out.println("Enter the 9 ISBN Digits");
//        String isbn9=input.nextLine();        //Taking the input by string
//        int i=1,D10=0;                        //Taking i for add the sum value in every digit calculation
//        for (int count=0;count<9;count++){
//            D10+=Integer.parseInt(isbn9.charAt(count)+"")*i;          //Converting String to int by apply formula for calculation
//            i++;
//        }
//        D10 %= 11;               //Taking the reminder by dividing with 11
//        for (int j=0; j<9;j++){
//            System.out.print(isbn9.charAt(j));       //Printing first 9 digits in a line
//        }
//            if (D10==10){                            //Printing the ISBN 10 digit
//                System.out.print("X");
//            }
//            else
//                System.out.print(D10);
    //5.41-(Occurrence of max numbers) Write a program that reads integers, finds the largest
        // of them, and counts its occurrences.
//        System.out.println("Enter the number below ");
//        String Str=input.nextLine();            //Taking the input in string
//        if (Str.length()<1){                    //checking if empty space entered
//            System.out.println("No number entered ");
//            System.exit(0);
//        }
//        int oc=0;                               //Occurrence for future count
//        int max = Integer.parseInt(Str.charAt(0)+"");   //execute max number to the first digit
//        for (int i=0; i<Str.length();i++ ){
//            int count=Integer.parseInt(Str.charAt(i)+"");   //count to compare or change the max number
//            if (count==max){
//                oc++;                       // ++ the oc if the count equals to max
//            }
//            else if(count>max){
//                max=count;                  //updating the max if count larger than max
//                oc=1;                       //initialize occurrence to 1
//            }
//        }
//        System.out.println("The Maximum Number is "+max);    //display the result
//        System.out.print("And Its Occurrence is " + oc);

    //5.44 - Computer architecture: bit-level operations- A short value is stored in 16 bits.
//        System.out.println("Enter a short value below");
//        short number=input.nextShort();      //Taking input
//        String bits= "";
//        for (int i=0;i<16;i++){           //loop for storing the bits until length equals to 16 bits
//            bits=(number&1)+ bits;      //using & AND bitwise operator
//            number>>=1;                 //right shirt bitwise operator used
//        }
//        input.close();
//        System.out.println("The bit number for the input is "+bits);
    //5.45-  Write a program that prompts the user to enter some numbers, and displays the
        //  mean and standard deviation
//        System.out.println("Enter the total Nos of Number that you have to enter ");
//        double n=input.nextInt();              //taking n for how many numbers to enter
//        System.out.println("Enter the numbers below");
//        double num, mean, deviation;
//        mean =deviation=0;              //initialize mean & deviation to 0
//        for (int i=0; i<n; i++){            //loop runs for n number of time
//            num= input.nextDouble();      //taking the number input
//            mean+= num;
//            deviation+= Math.pow(num,2);   //SumOfAllSquares for calculate deviation
//        }
//        deviation=Math.sqrt((deviation - (Math.pow(mean, 2) / n)) / (n - 1));  //Formula of deviation
//        mean/=n;                                //divide sum of numbers with n for mean value
//        System.out.println(mean+"   "+deviation);       //Display
//
//
        System.out.println("Enter the 12 ISBN Digits");
        String isbn12=input.nextLine();        //Taking the input by string
        if (isbn12.length()<12){
            System.out.println("Input is invalid" );
            System.exit(1);
        }
        int d13=0,num, checkSum=0;                        //Taking i for add the sum value in every digit calculation
        for (int count=0;count<12;count++){
            num=Integer.parseInt(isbn12.charAt(count)+"");          //Converting String to int by apply formula for calculation
            System.out.println(num);
            if (count%2==0) {                                          //checking and summation of digits (Ref- Formula)
                checkSum += (num * 3);
            }
            else {
                checkSum+=num;
            }
        }
        d13=10-checkSum%10;      //Taking the reminder by dividing with 10  subtract 10
        for (int j=0; j<12;j++){                   //Printing first 12 digits in a line
            System.out.print(isbn12.charAt(j));
        }
            if (d13==10){                            //Printing the ISBN 13 digit
                System.out.print("0");
            }
            else
                System.out.print(d13);
    }
}

