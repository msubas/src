package day17_d0WHILEDOloop;

import java.util.Scanner;

public class IV_TAKS4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        for (int i=0;i==0;) {


            System.out.println("Enter the First number");
            int FN = input.nextInt();
            System.out.println("Enter the Second number");
            int SN = input.nextInt();
            System.out.println("Enter your operator");
            char op = input.next().charAt(0);


            if (op == '+') {
                System.out.println(FN + SN);
            } else if (op == '-') {
                System.out.println(FN - SN);
            } else if (op == '*') {
                System.out.println(FN * SN);
            } else if (op == '/') {
                System.out.println(FN / SN);
            } else if (op == '%') {
                System.out.println(FN %= SN);
            }
            else {
                System.out.println("invalid Operator");
            }

            System.out.println("Do you wanna continue?");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                {
                    break;
                } } } }}
                /*
 4.	write a program that can calculate the two
         numbers based on the user provided operators,
         the program will ask:
        1. enter first number
        2. enter the second number
        3. enter the math operators
        (assume that only the +, -, *, /, and % will be
        entered)
        then the system will give the result based on
        the operator
        at the end it will ask if the user want's to
        calculate another numbers, if user
        entered "NO" or "no", the program will stop
        execution, otherwise it repeats all the previous
         steps
        (you will need a lop that has true condition
        without the iterator)
 */