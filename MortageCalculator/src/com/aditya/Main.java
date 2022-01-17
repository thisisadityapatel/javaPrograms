package com.aditya;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberOfMonths = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mortgage Calculator");
        System.out.println("-------------------");
        System.out.print("Principle : ");
        double p = scanner.nextFloat();
        System.out.print("Annual Interest Rate : ");
        double rate = scanner.nextFloat();
        System.out.print("Period (In Years) : ");
        int n = scanner.nextByte();
        n = n * numberOfMonths;
        //using the formula calculating the mortgage of the person
        rate = rate / 100 / numberOfMonths;
        double mortgage = (p * (rate * Math.pow(rate + 1, n ))) / ((Math.pow(rate + 1, n)) - 1);
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));


    }
}
