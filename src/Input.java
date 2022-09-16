//NAME -

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is your favorite number?");
        double myFNumber = keyboard.nextDouble();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("What is your name?");
        String name = keyboard.nextLine();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("Do you have a pet? ");
        String pet = keyboard.nextLine();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("What month is your birthday in? (The Number)");
        double month = keyboard.nextDouble();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("How many digits of Pi do you know?");
        int knownPi = keyboard.nextInt();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("Choose a number 1 through 10" );
        int oneTen = keyboard.nextInt();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("Do you like Reading? (1 for yes 0 for no)");
        short read = keyboard.nextShort();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("What number do you hate? (1 to 32)");
        short hate = keyboard.nextShort();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("What is the biggest number you can think of? (Numbers only.)");
        float longest = keyboard.nextFloat();


        System.out.println("Press ENTER to continue");
        keyboard.nextLine();


        System.out.println("What is the shortest number you can think of?");
        float shortest = keyboard.nextFloat();


        System.out.println("Press ENTER to see your answers.");
        keyboard.nextLine();




        System.out.println("Your Name is " + name);
        System.out.println("You were born in " + month );
        System.out.println("Your favorite number is :: " + myFNumber);
        System.out.println("You know " + knownPi + " digits of Pi." );
        System.out.println("A number you chose is :: " + oneTen );
        System.out.println("Do you have a pet :: " + pet);
        System.out.println("Do you like reading? :: " + read);
        System.out.println("You hate the number :: " + hate);
        System.out.println("The longest number you can think of is :: " + longest);
        System.out.println("The shortest number you can think of is :: " + shortest);




    }
}