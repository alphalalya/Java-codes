package edu.cscc;

public class main {

    static void welcome()
    {

        System.out.println ("welcome, Rama");
    }
     static int add(int number1, int number2)
     {
         int result = number1 + number2;
         return result;
     }

     public static void main (String[] args){

        welcome();

        int a=23, b=13;

         int c = add (a,b);
        System.out.println(c);
     }

}
