package SundayStudy;

import java.util.Scanner;

public class numberascending {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the first number");
        double n1=input.nextDouble();
        System.out.println("enter the second number");
        double n2=input.nextDouble();
        System.out.println("enter the third number");
        double n3=input.nextDouble();

        if(n1>n2 && n1>n3 && n2>n3){
            System.out.println(n1+">"+n2+">"+n3);}
        if(n1>n2 && n1>n3 && n3>n2 ){
            System.out.println(n1+">"+n3+">"+n2);}
        if(n2>n1 && n2>n3&&n1>n3){
            System.out.println(n2+">"+n1+">"+n3);}
        if(n2>n1 && n2>n3&&n3>n1){
            System.out.println(n2+">"+n3+">"+n1);}
        if(n3>n1 && n3>n2&&n1>n3){
            System.out.println(n3+">"+n1+">"+n2);}
        if(n3>n1 && n3>n2&&n2>n1){
            System.out.println(n3+">"+n2+">"+n1);}
    }
}
