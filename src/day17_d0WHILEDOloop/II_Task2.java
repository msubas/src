package day17_d0WHILEDOloop;

import java.util.Scanner;

public class II_Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int minnumber=999999999;

        for(int i=1; i<6; i++){

            System.out.println("Enter a number");
            int num=input.nextInt();

            if(num<minnumber){
                minnumber=num;}

            }
        System.out.println("min number is "+minnumber);
        }

    }

/*
 2. write a program that can ask the user "enter
        a number" five times and return the minimum
        number
        hint: you will nedd for loop and if statement


 */