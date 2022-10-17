package com.company;
import java.util.Scanner;
public class Stone_Paper_Scissor {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);

        // we are now going to taking the input of the user
        System.out.println("Enter 1 for Stone, 2 for paper & 3 for Scissor");
        int New= Input.nextInt();
        // Now we are going to create a new number randomly between 1 to 3
        int Number1 = (int) ( 1+ Math.random() *3 );

        System.out.println( New + " VS. " + Number1);
        //Using conditionals
         if (New == 1 && Number1 == 2){
             System.out.println(" Winner is CPU. Try again");
         }
         else if (New == 2 && Number1 == 1){
             System.out.println( "Congrats, you are the Winner");
         }
         else if ( New == 2 && Number1 == 3){
            System.out.println("Winner is CPU. Try again");
         }
         else if ( New == 3 && Number1 == 2){
            System.out.println("You are the winner");
         }
         else if (New == 3 && Number1==1){
             System.out.println("Winner is CPU. Try again");
         }
         else if(New == 1 && Number1 ==3 ){
             System.out.println("Congrats, You are the Winner");
         }
         else if ( New == Number1){
             System.out.println("match is draw");
         }
         else {
             System.out.println("Error Input");
         }

    }
}
