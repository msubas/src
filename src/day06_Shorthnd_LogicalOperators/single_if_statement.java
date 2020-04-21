package day06_Shorthnd_LogicalOperators;

public class single_if_statement {

    public static void main(String[] args) {
        /*
        Single if statement
        If condition is correct java will run it
        that condition should be boolean statement
                if(boolean expression) { code is here  System.out.println; }

         */

        boolean Coldweather = true;
        if (Coldweather) {
            System.out.println("Wear your jacket");
            System.out.println("Wear you Hat");

        }

        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println("buy more toilet papers");


        }
        int number = 100;
        boolean evennum = number % 2 == 0;
        boolean oddnumber = number % 2 != 0;
        if (evennum) {
            System.out.println(number + " even number");
            if(!evennum){
                System.out.println(number+ "odd number");
        }

        int m=101;
        boolean oddnum= m%2!=0;
        if (oddnum) {
            System.out.println(m + " is odd number");
        }
    }
}}