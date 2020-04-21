package day12_ReviewScanner;

import java.util.Scanner;

public class TASKofTHEday {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
/*
order 5 number from smaller to bigger one

 */

        System.out.println("Enter five numbers");
        double num1= input.nextDouble();
        double num2= input.nextDouble();
        double num3= input.nextDouble();
        double num4= input.nextDouble();
        double num5= input.nextDouble();

        if (num1>num2&& num2>num3&&num3>num4&&num4>num5){
            System.out.println(num1+">"+num2+">"+num3+">"+num4+">"+num5);
        };
        if(num2>num1&& num1>num3 && num3>num4 && num4>num5)
        { System.out.println(num2+">"+num1+">"+num3+">"+num4+">"+num5);}
        if(num3>num1&& num1>num2 && num2>num4 &&num4>num5);
        {System.out.println(num3+">"+num1+">"+num2+">"+num4+">"+num5);}
        if(num4>num1&& num1>num2&&num2>num3&&num3>num5){
            System.out.println(num4+">"+num1+">"+num2+">"+num3+">"+num5);
        };
        if(num5>num1&& num1>num2&&num2>num3&&num3>num4){
            System.out.println(num5+">"+num1+">"+num1+">"+num2+">"+num4);}
        };

        }





