package com.company;

public class CWH_27_ArraysDetails {
    public static void main(String[] args) {
        // Printing of arrays in 4 different ways
        //creating an array of int elements
        int marks[]={55,78,95,68,77,85};
        System.out.println( "the length of the array is "+ marks.length);
        //1. printing the array in naive way
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);
        // this is the easiest way but a time taking way which is not possible to write on bulk data

        //2. Printing the array in increment format by using for loop
//        for (int i=0; i< marks.length;i++){
//            System.out.println(marks[i]);

        //3.printing the same loop on decrementing order by using for loop
//       for (int i=marks.length-1 ;i>=0 ; i--){
//           System.out.println(marks[i]);
//        }
        //4. Printing the array by using for each loop (most efficient way)
//        for (int elements:marks){
//            System.out.println(elements);
//        }
        // Multidimentional arrays
            int[][] flats = new int[2][3];
            flats [0][0]= 101;
            flats [0][1]= 102;
            flats [0][2]= 103;
            flats [1][0]= 201;
            flats [1][1]= 202;
            flats [1][2]= 203;

        //Printing the array in increment format by using for loop
        for (int i=0; i< flats.length;i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

