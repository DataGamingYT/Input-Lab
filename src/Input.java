//NAME -

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is your favorite number?");
        double myFNumber = keyboard.nextDouble();


        keyboard.nextLine();


        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );


        System.out.println("Your first number is ::" + myFNumber);


        //add output for all variables


    }
}
 //System.out.println("Enter your value for pi");
   //      double myPiVal = keyboard.nextDouble();

         //clearing the buffer
     //    keyboard.nextLine();

       //  System.out.println("What's your name?");
         //String name = keyboard.nextLine();


         //m.out.println("How old are you?");
         ///int age = keyboard.nextInt();


         //System.out.println("Your name is " + name);
         //System.out.println("You are " + age + " years old");
         //System.out.println("Your Pi value is " + myPiVal);