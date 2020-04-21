package Saturday_Study;

import java.util.Scanner;

public class VI_Practice6 {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number");
        int a=input.nextInt();
        System.out.println("Enter your second number");
        int b=input.nextInt();
        System.out.println("Enter your third number");
        int c=input.nextInt();
        System.out.println("Enter your fourth number");
        int d=input.nextInt();
        System.out.println("Enter your fifth number");
        int e=input.nextInt();


        boolean b1= a>b && a>c && a>d && a>e ;
        boolean b2= b>a && b>c && b>d && b>e;
        boolean b3= c>a && c>b && c>d && c>e;
        boolean b4= d>a && d>b && d>c && d>e;
        boolean b5= e>a && e>b && e>c && e>d;


        if(b1==true){System.out.println(a+" is the max number");}
        else if(b2==true){System.out.println(b+" is the max number");}
        else if(b3==true){System.out.println(c+" is the max number");}
        else if(b4==true ){System.out.println(d+" is the max number");}
        else if(b5==true) {
            System.out.println(a + " is the max number");}

        }}
/*
write a program that can ask the user "enter a number"
five times and return the maximum number
				hint: you will nedd for loop and
				if statement
 */