package com.company;
import java.util.Scanner;
public class CWH_09_Prec_Ascvty {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);

        //Precedence and Associativity
        //method 1
        //int a=10;
        //int b=5;
        //int c= 2;
        //int d= 8;
        //int calculation = a*b + d/c;
        //System.out.println(calculation);
        // highest precedence goes to * & / and according to Associativity it evaluates from left to right.

      //Method 2
      //  int e =2;
      //  int f=4;
      //  int g= 10;
      //  int Value= e*f - (2*g*f)/(e*f);
      //  System.out.println(Value);
        // Brackets have more precedence than the * & / that's why they evaluate first.

      //Problem X (from Book) convert the fahrenheit into celsius
      /*  System.out.println("Enter the fahrenheit degree for convert into celsius");
        double fahrenheit= Sc.nextDouble();

        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("The fahrenheit " + fahrenheit + " in celsius is "+ celsius); */

     //Problem Y (from book) writing expression of Polynomial values in java
        int R = 4;
        int a= 2;
        int b= 3;
        int c= 5;
        int d = 6;

        System.out.println(4/(3*(R+34))-9*(a+(b*c))+(3+d*(2+a))/a+(b*d));






    }
}
