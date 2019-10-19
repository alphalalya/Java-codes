package edu.cscc;

import java.util.Scanner;

public class CarDemo

{

    public static void main(String[] args)

    {
        Car yourCar;
        String make;
        double yearModel, speed;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the car's year model? ");
        yearModel = sc.nextDouble();

        System.out.print("What is the make of the car? ");
        make = sc.nextLine();


        yourCar = new Car(0, make);

        System.out.println("Current status of the car:");
        System.out.println("Year model: " + yourCar.getYearModel());
        System.out.println("Make: " + yourCar.getMake());
        System.out.println("Speed: " + yourCar.getSpeed());

        // Accelerate the car five times.

        System.out.println("Speed up!");
        System.out.println();
        for(int i=0; i<5; i++)

        {


            yourCar.accelerate();
            System.out.println("demoCar's speed " + yourCar.getSpeed());// Display the speed.

        }
        System.out.println();
        // Brake the car five times.
        System.out.println("Slow down!");
        System.out.println();
        for(int i=0; i<5; i++)

        {

            yourCar.brake();

            System.out.println("demoCar's speed " + yourCar.getSpeed());// Display the speed.

        }

    }

}