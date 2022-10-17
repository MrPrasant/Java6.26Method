package com.company;
import java.util.Scanner;
public class Math_Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// 4.2-The great circle distance between 2 places
        //1st we have to collect the two longitude and latitude points of that 2 places
//    final double radius = 6371.01;   //fixed radius of earth
//    //let the user enter 4 point of 2 places in degrees
//        System.out.println("*Note- Use negative to indicate south and east degrees");
//        System.out.print("Please enter the latitude point of the 1st place:");
//        double one= input.nextDouble();
//        System.out.print("Please enter the longitude point of the 1st place:");
//        double two= input.nextDouble();
//        System.out.print("Please enter the latitude point of the 2nd place:");
//        double three= input.nextDouble();
//        System.out.print("Please enter the longitude point of the 2nd place:");
//        double four= input.nextDouble();
//    //for using the math trigonometric methods we have to convert degrees to radians
//        double x1=Math.toRadians(one);
//        double y1=Math.toRadians(two);
//        double x2=Math.toRadians(three);
//        double y2=Math.toRadians(four);
//    //After taking the degrees of points now time to convert them to radians
//        double distance = radius*(Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
//        System.out.println("The distance between two points is "+distance+" K.M"); //Display the Distance
        //  4.12- Convert a hexadecimal to binary code
//        System.out.println("Enter the hexadecimal in 1 digit ");
//        String hex = input.nextLine();
//        // Checking the length either greater than 1
//        if (hex.length() != 1) {
//            System.out.println("The hexadecimal is more than one digit");
//            System.exit(1);
//        }
//        // Converting the string to Ch
//        char ch = hex.charAt(0);
//        if ((1 <= ch && ch <= 9) || ('A' <= ch && ch <= 'F')){
//            System.out.print("The Binary code for the hex value " + hex + "is:");
//            switch (ch){
//                case 'A':
//                    System.out.print(1010);break;
//                case 'B':
//                    System.out.print(1011);break;
//                case 'C':
//                    System.out.print(1100);break;
//                case 'D':
//                    System.out.print(1101);break;
//                case 'E':
//                    System.out.print(1110);break;
//                case 'F':
//                    System.out.print(1111);break;
//                case 1:
//                    System.out.print(1016);break;
//                case 2:
//                    System.out.print(1017);break;
//                case 3:
//                    System.out.print(1018);break;
//                case 4:
//                    System.out.print(1019);break;
//                case 5:
//                    System.out.print(1020);break;
//                case 6:
//                    System.out.print(1004);break;
//                case 7:
//                    System.out.print(1003);break;
//                case 8:
//                    System.out.print(1002);break;
//                case 9:
//                    System.out.print(1001);break;
//            }
//        }
//        else
//            System.out.println("Invalid input entered");
        // 4.13- Vowel or constant
//        String vowels="AEIOU";
//        System.out.println("Enter a Character ");
//        String str = input.nextLine();
//        if (str.length()!=1){
//            System.out.println("Enter only onr character");
//            System.exit(1);
//        }
//        char ch = Character.toUpperCase(str.charAt(0));
//        if (Character.isLetter(ch)){
//            switch (ch) {
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                    System.out.println("that character is a vowel"); break;
//                default:
//                    System.out.println("That character is a constant");
//            }
//        }
//        else {
//            System.out.println("Inputted character is invalid");
//        }
        //4.15-Phone key pads
//        System.out.println("Enter the character in 1 digit");
//        String str = input.nextLine();
//        if (str.length()!=1){
//            System.out.println("More than 1 character entered");
//            System.exit(1);
//        }
//        char ch = Character.toUpperCase(str.charAt(0));
//        if ('A'<=ch && ch<='C'){
//            System.out.println("your  letter  is on the number 2");
//        }
//        else if ('D'<=ch && ch<='F'){
//            System.out.println("your  letter  is on the number 3");
//        }
//        else if ('G'<=ch && ch<='I'){
//            System.out.println("your  letter  is on the number 4");
//        }
//        else if ('J'<=ch && ch<='L'){
//            System.out.println("your  letter  is on the number 5");
//        }
//        else if ('M'<=ch && ch<='O'){
//            System.out.println("your  letter  is on the number 6");
//        }
//        else if ('P'<=ch && ch<='S'){
//            System.out.println("your  letter  is on the number 7");
//        }
//        else if ('T'<=ch && ch<='V'){
//            System.out.println("your  letter  is on the number 8");
//        }
//        else if ('W'<=ch && ch<='Z'){
//            System.out.println("your  letter  is on the number 9");
//        }
//        else{
//            System.out.println("Invalid Input");
//    }
//    //4.17-(Days of a month)
//        System.out.println("Enter the year");
//        int year = input.nextInt();
//        System.out.println("Enter the month's 3 letter name with 1st letter in uppercase");
//        String yr = input.nextLine();
//        String feb ="Feb";
//        if (year%4==0 && yr.equalsIgnoreCase(feb)){
//            System.out.println("29 days");
//        }
//        else if (year % 4 != 0){
//            switch (yr) {
//                case "Jan":
//                    System.out.println("31 days");
//                case "Feb":
//                    System.out.println("28 days");
//                case "Mar":
//                    System.out.println("31 days");
//                case "Apr":
//                    System.out.println("30 days");
//                case "May":
//                    System.out.println("31 days");
//                case "Jun":
//                    System.out.println("30 days");
//                case "Jul":
//                    System.out.println("31 days");
//                case "Aug":
//                    System.out.println("31 days");
//                case "Sep":
//                    System.out.println("30 days");
//                case "Oct":
//                    System.out.println("31 days");
//                case "Nov":
//                    System.out.println("30 days");
//                case "Dec":
//                    System.out.println("31 days");
//            }
//        }
        //4.18- Stdents major and Status
        //declaring 3 types of professions
        String m = "Mathematics";
        String c = "Computer Science";
        String i = "Information And Technology";
        System.out.print("Enter 2 characters for Major and Status:");
        String user = input.nextLine();  //taking the input

        char ch = Character.toUpperCase(user.charAt(0));
        int exp = user.charAt(1);
        // identifying the major and status by using (If-else) with switchCase
        if (ch == (char) 'M') {
            switch (exp) {
                case '1' -> System.out.println(m + " freshman");
                case '2' -> System.out.println(m + " sophomore");
                case '3' -> System.out.println(m + " Junior");
                case '4' -> System.out.println(m + " Senior");
            }
        }
        else if (ch == (char) 'C') {
            switch (exp) {
                case '1' -> System.out.println(c + " freshman");
                case '2' -> System.out.println(c + " sophomore");
                case '3' -> System.out.println(c + " Junior");
                case '4' -> System.out.println(c + " Senior");
            }
        }
        else if (ch == (char)'I'){
            switch (exp) {
                case '1' -> System.out.println(i + " freshman");
                case '2' -> System.out.println(i + " sophomore");
                case '3' -> System.out.println(i + " Junior");
                case '4' -> System.out.println(i + " Senior");
            }
        }
        else  {
            System.out.println("Invalid Input");
        }
    }
}