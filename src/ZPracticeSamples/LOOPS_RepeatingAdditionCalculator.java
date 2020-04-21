package ZPracticeSamples;

import java.util.Scanner;

public class LOOPS_RepeatingAdditionCalculator {

    //          Repeating addition calculator
    /*
   After this lesson you will be able to;
   1- import java.util.Scanner
   2-Create a FOR LOOP with a counter which will keep the inside of the loop true
   3- Ask user to enter two numbers
   4- See the result of the addition operation
   5-Ask user do you want to enter another number?
   6-Write a if/else statement with equalsIgnoreCase
   7-Based on the user response system will let the user to enter another 2 numbers
   8-say Thank you and Good bye.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        for (int m = 0; m < counter; m++) {
            System.out.println(" Enter two numbers");
            counter++; //this count is going to keep our statement true
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + "+" + b + "=" + (a + b));
            System.out.println("Do you want to enter another number");
            String response = input.next();
            if (response.equalsIgnoreCase("yes")) {
            } else {
                System.out.println("Thank you" + "\n" + "Good Bye!!!");
                break;
            }
        }
    }
}







