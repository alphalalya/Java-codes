package edu.cscc;

/*
	Chapter 6:
	Programmer: Alpha Bah
	Date:       03/01/2018
	Filename:	TempConverter.java
	Purpose:	This program converts temperature.
*/

import java.util.Scanner;

public class TempConverter{

    public static void main(String[] args) {

        print(" === Converting Temperature ===\n");
        convertTemperature();
    }

    private static void convertTemperature() {

        Scanner input = new Scanner(System.in);
        print("\nEnter 1 for Fahrenheit to Celsius"
                + "\nEnter 2 for Celsius to Fahrenheit"
                + "\nSomething else to Exit." + "\nYour Option:");
        int selection = input.nextInt();
        if (selection == 1) {
            print("Enter a degree in Fahrenheit:");
            far2cel();
        } else if (selection == 2) {
            print("Enter a degree in Celsius:");
            cel2far();
        } else {
            print("Bye..");
        }
    }

    private static void cel2far() {

        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        print(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32)
                + " Fahrenheit");
        convertTemperature();
    }

    private static void far2cel() {

        Scanner input = new Scanner(System.in);

        Double Fahrenheit = input.nextDouble();
        print(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0))
                + " celsius");
        convertTemperature();
    }

    private static void print(String string) {

        System.out.print("\n" + string);
    }
}
