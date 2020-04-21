package day17_d0WHILEDOloop;

import java.util.Scanner;

public class I_Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int maxnumber=-99999999;

        for (int i=1; i<6; i++){
            System.out.println("Enter a number");
            int num= input.nextInt();
            if(num>maxnumber) {
                maxnumber = num;
            }

            }
        System.out.println("max number is "+maxnumber);


    }}

/*Warmup tasks:
        1. write a program that can ask the user
        "enter a number" five times and return the
        maximum number
        hint: you will nedd for loop and if statement

 */
