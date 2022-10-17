package com.company;
import java.util.Scanner;
public class Method_Exercise {
    static Scanner sc = new Scanner(System.in);
    //6.1 (Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the number of which you want to find the pentagon number");
//        int number = input.nextInt();
//        System.out.printf("%4d",getPenta(number));
//    }
//    public static int getPenta(int n){
//        int PentaNumber = (n*(3*n-1))/2;
//        return PentaNumber;
//    }
    // 6.2(Sum the digits in an integer)
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number below");
//        long num = input.nextLong();
//        System.out.println(sumDigits(num));    //calling the method
//    }
//    public static int sumDigits(long n ){
//        int sum=0;
//        int reminder,extract;
//        while (n>0){            // execute the loop until n becomes 0
//            reminder = (int) n%10;   // % operator to get reminder
//            extract = (int) n/10;
//            sum +=reminder;
//            n=extract;           //update the 'n' each time the loop executed
//        }
//        return sum;
//    }
    //6.3 - Displaying that a number is a palindrome or not
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the integer to check weather its a palindrome");
//        int number = input.nextInt();
//        String palindrome = reverse(number);
//        if (number == Integer.parseInt(palindrome)){
//            System.out.println("Its a palindrome");
//        }
//        else {
//            System.out.println("Its not a palindrome");
//        }
//    }
//    public static String reverse(int num) {
//        String palindrome = "";
//        while (num > 0) {
//            palindrome += num % 10;
//            num = num / 10;
//        }
//        return palindrome;
//    }
    //6.5- Display 3 numbers in increasing order

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Three numbers below to sort in increase order");
//        double num1 = sc.nextDouble();
//        double num2 = sc.nextDouble();
//        double num3 = sc.nextDouble();
//        increaseOrder(num1, num2, num3);
//    }
//    public static void increaseOrder(double a, double b, double c) {
//        double temp;
//        if (b < a && b < c) {
//            temp = a;
//            a = b;
//            b = temp;
//        }
//        else if (c < a && c < b) {
//            temp = a;
//            a = c ;
//            c= temp;
//        }
//        if ( c < b){
//            temp = b;
//            b = c;
//            c=temp;
//        }
//        System.out.println(a + " " + b +" "+ c);
//    }

    //6.7- Financial Application:Investment value
//    public static double investmentValue(double amount, double years, double monthlyInterest){
//        double finalValue = amount;
//        double totalMonths= years*12;
//        for (int i = 1; i<=totalMonths;i++ ){
//            finalValue += (amount*monthlyInterest)/100;
//        }
//        return finalValue;
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the Total amount you want to invest");
//        double amount= sc.nextDouble();
//        System.out.println("Enter the Interest rate");
//        double interest = sc.nextDouble();
//        System.out.println("Enter the Time in Years");
//        double years = sc.nextDouble();
//        System.out.println("The total amount after maturity is:" +investmentValue(amount,interest,years) );
//    }
    //6.8(Conversions between Celsius and Fahrenheit)
//    public static void celsiusAndFahrenheit(double cel, double far){
//        String celsius,Fahrenheit;
//        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
//        System.out.println("--------------------------------------------");
//        for (int i= 1;i<=10;i++){
//            double toFar =(9.0/5.0)*cel+32;
//            double toCel =(5.0/9.0)*(far-32);
//            System.out.printf("%4.2f\t%4.2f\t\t|\t%4.2f\t\t%4.2f\n",cel,toFar,far,toCel);
//            cel--;
//            far-=10;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the celsius");
//        double cel = sc.nextDouble();
//        System.out.println("Enter the Fahrenheit");
//        double far = sc.nextDouble();
//        celsiusAndFahrenheit(cel,far);
//    }
    //6.10- Show the primeNumbers between 1-10000
//    public static void isPrime(int a, int b){
//        int count=0;
//        while (a<=b){
//            boolean isPrime= true;
//            for (int divisor=2;divisor<=(a/2);divisor++){   //Divide the number until the divisor get
//                                                            // higher than the numbers half
//                if (a % divisor ==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if (isPrime){
//                count++;
//                if (count%10==0){
//                    System.out.println(a+" ");
//                }
//                else{
//                    System.out.print(a+" ");
//                }
//            }
//            a++;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the start Number");
//        int num1= sc.nextInt();
//        System.out.println("Enter the end Number");
//        int num2= sc.nextInt();
//        isPrime(num1,num2);
//    }
    //6.12-(Display characters)
//    public static void printChar(char ch1 , char ch2, int numberPerLine){
//        int count=0;
//        for (int i= (int)ch1; i<=(int)ch2;i++){
//            System.out.print((char)i +" ");
//            count++;
//            if (count%numberPerLine==0){
//                System.out.println();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the starting char");
//        String start = sc.nextLine();
//        System.out.println("Enter the Ending character");
//        String end = sc.nextLine();
//        int numberPerLine = 10;
//        char ch1 = start.charAt(0);
//        char ch2= end.charAt(0);
//        printChar(ch1,ch2,numberPerLine);
//    }
    //6.13 (Sum series)
//    public static void SumSeries(double i){
//        double value=0;
//        double k=0;
//        for (int j = 1; j <= i; j++) {
//            k = j;
//            k /= j + 1;
//            value += k;
//            System.out.printf("%d\t\t\t%1.4f\n",j,value );
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the sumSeries Number");
//        double i = sc.nextDouble();
//        System.out.println("i\t\t\t m(i)");
//        SumSeries(i);
//    }
    //6.16-(Number of days in a year)
//    public static void daysInYear(int startYear, int endYear){
//        System.out.println("Year\t\tDays");
//        while(startYear<=endYear){
//            if (startYear%4==0 || startYear%100==0){
//                System.out.println(startYear + "\t\t"+"366");
//            }
//            else {
//                System.out.println(startYear + "\t\t"+"365");
//            }
//            startYear++;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the start year");
//        int startYear= sc.nextInt();
//        System.out.println("Enter the End year");
//        int endYear= sc.nextInt();
//        daysInYear(startYear,endYear);
//    }
    //6.18-(Check Password)
//    public static boolean checkPassword(String pWord) {
//        boolean isValid = false;
//        for (int i = 0; i < pWord.length(); i++) {
//            char j = pWord.charAt(i);
//            if (pWord.length() > 7) {
//                isValid = true;
//                if (Character.isDigit(j)) {
//                    isValid = true;
//                } else if (Character.isLetter(j)) {
//                    isValid = true;
//                }
//            }
//        }
//        return isValid;
//    }
//        public static void main(String[]args){
//            System.out.println("Enter the password to check");
//            String pass = sc.nextLine();
//            if (checkPassword(pass)){
//                System.out.println("Valid Password");
//            }else {
//                System.out.println("Not valid");
//            }
//        }
    //6.19-Write a test program that reads three sides for a triangle and uses the isValid
    //method to test if the input is valid and uses the area method to obtain the area.
//    public static void main(String[] args) {
//        System.out.println("Enter the 3 sides of the triangle");
//        double side1=sc.nextDouble();
//        double side2=sc.nextDouble();
//        double side3=sc.nextDouble();
//        isValid(side1,side2,side3);
//    }
//    public static void isValid(double s1, double s2, double s3) {
//        if (s1+s2 > s3 && s2+s3 > s1 && s3+s1 > s2){
//            System.out.println("its a valid triangle");
//            triangleArea(s1, s2, s3);
//        }else System.out.println("Not a valid triangle");
//    }
//    public static void triangleArea(double s1, double s2, double s3) {
//        double s = (s1+s2+s3)/2;
//        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
//        System.out.printf("Area of the triangle is %.2f",area);
//        }
    //6.21- Phone keypad
//    public static int getNumber(char c) {
//        int n = 0;
//        if (c=='a'|| c=='b'||c=='c'){
//            n=2;
//        }else if (c=='d'||c=='e'||c=='f') {
//            n=3;
//        }else if (c=='g'||c=='h'||c=='i') {
//            n=4;
//        }else if (c=='j'||c=='k'||c=='l') {
//            n=5;
//        }else if (c=='m'||c=='n'||c=='o') {
//            n=6;
//        }else if (c=='p'||c=='q'||c=='r'||c=='s') {
//            n=7;
//        }else if (c=='t'||c=='u'||c=='v') {
//            n=8;
//        }else if (c=='w'||c=='x'||c=='y'|| c=='z') {
//            n=9;
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the input");
//        String string = sc.nextLine();
//        System.out.print("The Number for input is - ");
//        for (int i = 0; i < string.length(); i++) {
//            if (Character.isLetter(string.charAt(i))) {
//                System.out.print(getNumber(Character.toLowerCase(string.charAt(i))));
//            } else {
//                System.out.print(string.charAt(i));
//            }
//        }
//        System.out.println();
//    }
    //6.22-(Math: approximate the square root)
//    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        long num= sc.nextLong();
//        System.out.println(sqrt(num));
//    }
//    public static double sqrt(long n){
//        double lastGuess=1;
//        double nextGuess= (lastGuess + n / lastGuess)/2;
//        double smallNum=0.0001;
//            while(nextGuess-lastGuess>smallNum){
//                lastGuess=nextGuess;
//                nextGuess= (lastGuess + n / lastGuess)/2;
//            }
//            lastGuess=nextGuess;
//        return nextGuess=(lastGuess + n / lastGuess)/2;
//    }
//    public static void main(String[] args) {
//        for (int i = 10; i < 100; i += 10) { //Exercise09_09
//            System.out.println("The result of the Babylonian sqrt method for: " + i + " = " + sqrt(i));
//            System.out.println("The result of Math.sqrt(i) method for: " + i + " = " + Math.sqrt(i));
//        }
//    }
//
//    public static double sqrt(long n) {
//        double lastGuess = 2;
//        double nextGuess = (lastGuess + n / lastGuess) / 2;
//
//        while (!diff(nextGuess, lastGuess)) {
//            lastGuess = nextGuess;
//            nextGuess = (lastGuess + n / lastGuess) / 2;
//        }
//        return nextGuess;
//
//    }
//
//    static boolean diff(double a, double b) {
//        return Math.abs(a - b) < 0.0001; // If the difference between nextGuess and lastGuess is less than 0.0001.
//    }
    //6.23- (Occurrences of a specified character)
//    public static void main(String[] args) {
//        System.out.println("Enter the string below");
//        String str= sc.nextLine();
//        System.out.println("Enter the specified character");
//        String c = sc.next();
//        System.out.println("Occurrence of the specified character is " +
//                count(str.toLowerCase(), Character.toLowerCase(c.charAt(0)))+" times");
//    }
//    public static int count(String str, char c) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c) {
//                count++;
//            }
//        }
//        return count;
//    }
    //6.24-Display current date and time)
//    public static void main(String[] args) {
//        System.out.print("The current (GMT) time is- ");
//        long seconds = System.currentTimeMillis();
//        System.out.println(getCurrentTime(seconds));
//    }
//    public static String getCurrentTime(long totalSeconds){
//        long seconds= totalSeconds/1000;
//        long currentSecond = seconds%60;
//        long minute = seconds/60;
//        long currentMinute= minute%60;
//        long hours= minute/60;
//        long currentHour= hours%24;
//        String time = currentHour+":"+ currentMinute+":"+currentSecond;
//        return time;
//    }
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
