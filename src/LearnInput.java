import java.util.Scanner;


public class LearnInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter your value for pi");
        double myPiVal = keyboard.nextDouble();

        //clearing the buffer
        keyboard.nextLine();

        System.out.println("What's your name?");
        String name = keyboard.nextLine();


        System.out.println("How old are you?");
        int age = keyboard.nextInt();


        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your Pi value is " + myPiVal);



    }

}
