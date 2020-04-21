package Saturday_Study;

import java.util.Scanner;

public class XV_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter number 1");
            int a = input.nextInt();
            System.out.println("Enter number 2");
            int b = input.nextInt();
            //System.out.println("Please select an operation" + "\n" + "+,-,*,/");
           // String x = input.next();

            System.out.println("Enter you response");
            int response = input.nextInt();

            if (response == (a + b)) {
                System.out.println("Good Job");
                break;

            } else {
                System.out.println("Sorry! Try again!!!");
            }


            //if(x.equals("+")){
            //  System.out.println("a+b= " + (a+b));
        }
    }
}

            /*


            if(x.equals("-")){
                System.out.println("a-b= " + (a-b));
            }
            if(x.equals("*")){
                System.out.println("a*b= " + (a*b));
            }
            if(x.equals("/")){
                System.out.println("a+b= " + (a/b)+ "reminder is "+ (a%b));

             */
