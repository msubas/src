package Day18_NestedLOOP;

import java.util.Scanner;

public class XVI_NestedloopPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true){
        System.out.println("Enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();

            System.out.println("Addition of two numbers"+
                    (num1+num2));
            System.out.println("Do you want to cont?");
            String answer=input.next();
            if(!(answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("no"))))

                if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for" +
                        "using the calculator");
                break;
            }

    }
}}
