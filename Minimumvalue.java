package edu.cscc;

import java.util.Scanner;

/*
	Chapter 7:
	Programmer: Alpha Bah
	Date:       03/18/2018
	Filename:	Minimumvalue.java
	Purpose:	Write a test program that prompts the user to enter ten
 *              numbers, invokes this method to return the minimum value,
 *              and displays the minimum value.
*/

public class Minimumvalue {

    static final int SIZE = 10;

    public static void main(String[] args) {

        double[] n = new double[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

        System.out.println("The minimum number is: " + min(n));
    }

    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) min = array[i];
        }

        return min;
    }
}