package com.company;
import java.util.Scanner;
public class Part_2_practise {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
//        //Calculating Taxable Value by using the below formula
//        System.out.println("Enter the Purchasing price of the Product");
//        double PurchaseAmount=Sc.nextDouble();
//        double Tax = PurchaseAmount * 0.06;
//        System.out.println("Taxable Value for the purchasing price is " + (int) (Tax* 100) / 100);
//
//       double Amount=5;
//        System.out.println( Amount/2 );
//        System.out.println( 5 / 2 );
//        double Value= 5565.3262;
//        long RoundedValue = Math.round(Value);
//        System.out.println( Value + " In round is " + RoundedValue);
        for (int i = 0; i<10;i++) {
            System.out.print(i + "    ");
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
