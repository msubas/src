package day17_d0WHILEDOloop;

import java.util.Scanner;

public class XVI_Replit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int running=10;
        int basketball=8;
        int sleeping=1;
        double Personweight=0;
        double PWpound=Personweight*2.20462;
        int TPtime=0;

        System.out.println("Welcome to the personal calorie calculator");
        System.out.println("         Enter Your name");
        String name=input.next();
        System.out.println("Please select your measure" +
                "\n"+" For Kg please enter 1 and enter" +
                "\n"+" For lb please enter 2 and enter");
        double weightselection=input.nextDouble();
        System.out.println("Please enter your weight.");
        int weight=input.nextInt();
        System.out.println("Total activity minutes");
        int min=input.nextInt();


        double calcalc1= 0.0175*running*weight*min;

        double calcalc2= 0.0175*running*weight*2.20462*min;

        System.out.println(calcalc1);
        System.out.println(calcalc2);

        }  }


/*
    One way to measure the amount of energy that is expended
    during exercise is to use metabolic equivalents (MET).

    Here are some METS for various activities:
    - Running 6 MPH: 10 METS
    - Basketball: 8 METS
    - Sleeping: 1 MET
    METS are given per minute.

    The number of calories burned per minute may be
    estimated using the following formula:
    cal = 0.0175 * MET * Weight in kilograms

    Write a program that asks user to enter his weight in
    pounds, and then calculates and outputs the total
    number of calories burned for a  person who runs
    6 MPH for 30 minutes, plays basketball for 30 minutes,
    and then sleeps for 6 hours.
    One kilogram is equal to 2.2 pounds.
 */