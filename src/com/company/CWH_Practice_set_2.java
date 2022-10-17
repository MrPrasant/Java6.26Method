package com.company;

public class CWH_Practice_set_2 {
    public static void main(String[] args) {
        //Problem 1
        String Name = "Prasanta Kumar";
        Name= Name.toLowerCase();
        System.out.println(Name);

        //Problem 2
        String Text = "Hello all of you";
        Text= Text.replace(" ","_");
        System.out.println(Text);


        //Problem 3
        String myString= "hello guys, have a    good   day";
        System.out.println(myString.indexOf("have"));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("ghijk"));


        //Problem 4
        String myLetter= "Hey this is Prasanta, \n\t\t Good morning,\n\t\t Have a good health";
        System.out.println(myLetter);


        //New Augmented Assignment Operator
        double a = 6.5;
        a += a+ 1;
        System.out.println(a);

        //Increment and decrement operator
        int X = 5;
        int y = 5* X--;
        System.out.println(y);
        System.out.println(X);

    }
}
