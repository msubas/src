package SundayStudy;

import java.util.Scanner;

public class compare2numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1=input.nextInt();

        System.out.println("Enter the second number");
        int n2= input.nextInt();

String compare=(n1>n2)? n1+">"+n2: (n2>n1)? n2+">"+n1: n1+"="+n2;
        System.out.println(compare);


    }
}
