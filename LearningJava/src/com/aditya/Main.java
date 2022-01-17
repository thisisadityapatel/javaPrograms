package com.aditya;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // writing down all the data formats
        String name = "Aditya Patel";
        byte standard = 12;
        int rollNumber = 21;
        long code = 1223455433L;
        char grade = 'A';
        float percent = 22.34F;
        boolean pass = true;

        //printing the information in java
        System.out.println(name);

        //printing the lenght of the string in python
        System.out.println(name.length());

        //looping through every element in the name (string)
        for(byte i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        //using the special characters in python
        System.out.println("\"Hello World\"");

        //initializing, sorting, and printing the array in python
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //printing the array
        System.out.println(Arrays.toString(array));

        //printing the sorted array
        Arrays.sort(array);
        System.out.println("Printing the sorted array : ");
        for(byte i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //making the multidimensional array in python
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        System.out.println(Arrays.deepToString(matrix));

        //using the constants in java
        final float p1 = 3.14F;

        //converting the string into integer in java
        String number = "1";
        System.out.println(Integer.parseInt(number));

        //using the MATH Function
        float temp = 2.34F;
        System.out.println((int)Math.round(temp));
        System.out.println(Math.ceil(temp));

        //printing the currency
        String amount = NumberFormat.getCurrencyInstance(Locale.US).format(12345666);
        System.out.println(amount);

        //printing the percent instance
        String percentage = NumberFormat.getPercentInstance().format(1234.445);
        System.out.println(percentage);

        //taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String firstName = scanner.next();
        System.out.println("Welcome Mr. " + firstName);

























    }
}
