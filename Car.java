package edu.cscc;
/*
	Chapter :
	Programmer: Alpha Bah
	Date:       03/18/2018
	Filename:	car.java
	Purpose:	
*/

public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    // initialize variables

    Car(int y, String m)
    {
        yearModel = y;
        make = m;
        speed = 0;
    }

    // setYear method
    public void setYearModel(int y)
    {
        yearModel = y;
    }
    // setMake method
    public void setMake(String m)
    {           make = m;

    }

    // set speed method
    public void setSpeed(int s)
    {
        speed = s;
    }

    // getYearModel method
    public int getYearModel()
    {
        return yearModel;
    }
    // getMake method
    public String getMake()
    {
        return make;
    }
    // getSpeed method
    public int getSpeed()
    {
        return speed;
    }
    // accelerate method accelerates the car's speed by 5

    public void accelerate()
    {
        speed += 5;
    }

    // brake method decreases the car's speed by 5

    public void brake()
    {
        speed -= 5;
    }

}
