package day06_Shorthnd_LogicalOperators;

public class night3 {
    public static void main(String[] args) {
        /*
        number1: 4number2: 8number3: 1
        The greatest number is:
         */

        int number1= 14;
        int number2= 13;
        int number3= 15;

        if (number1>number2 && number1>number3){
            System.out.println(number1 + " is the biggest number");}
        if (number2> number1 && number2>number3) {
            System.out.println( number2 + " is the biggest number");}
        if (number3>number1 && number3>number2){
            System.out.println( number3 +" is the biggest number");}
        if (number1==number2 && number2==number3){
            System.out.println(" All numbers are equal to each other");
        }    }



    }

