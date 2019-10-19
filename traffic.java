package edu.cscc;
/*
	Chapter 6:	Traffic Ticket
	Programmer: Alpha Bah
	Date:       03/01/2018
	Filename:	Traffic.java
	Purpose:	This program calculates a traffic ticket and court costs.
*/

import javax.swing.*;

public class traffic
{
    public static void main(String[] args)
    {
        //declare class variables
        double fine;
        double courtCosts = 0;
        double ticket = 0;
        int speedLimit, offenderSpeed, previousTickets, overLimit;
        System.out.println("       *****Ticket Calculator*****");


        //call methods

        speedLimit = getLimit();
        offenderSpeed = getDriverSpeed();
        if (offenderSpeed <= speedLimit)
        {
            JOptionPane.showMessageDialog(null,"No violation", "Franklin County",JOptionPane.INFORMATION_MESSAGE);
            finish();
        }


        previousTickets = getTickets();
        overLimit = offenderSpeed - speedLimit;
        fine = overLimit * 20.00;
        courtCosts = getCosts(previousTickets);
        ticket = fine + courtCosts;
        output(fine, courtCosts, ticket);
        finish();
    }




    //The getLimit() method asks the user to input a the speed limit.
    public static int getLimit()
    {
        //declare method variables
        int limit = 0;
        String answer;
        do {
            answer = JOptionPane.showInputDialog(null, "Enter speed limit: ",JOptionPane.INFORMATION_MESSAGE);
            if (answer == null);
            {


            }
            limit = Integer.parseInt(answer);
        } while (limit == 0);
              if (limit <0)






        return limit;
        return limit;
    }

    //The getDriverSpeed() method asks the user to input the offender's speed.
    public static int getDriverSpeed()
    {
        //declare method variables
        int speed = 0;
        String answer;





        return speed;
    }

    //The getTickets() method retrieves number of tickets.
    public static int getTickets()
    {
        //declare method variables
        int tickets = 0;
        String answer;



        return tickets;
    }

    //The getCosts() method returns the court costs.
    public static double getCosts(int tickets)
    {
        double costs = 0.0;



        return costs;
    }

    //The output() method displays the cost of the ticket.
    public static void output(double dFine, double dCost, double dTicket)
    {



    }

    //The finish() method ends the program.
    public static void finish()
    {
        System.exit(0);
    }
}