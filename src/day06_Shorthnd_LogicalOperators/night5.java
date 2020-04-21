package day06_Shorthnd_LogicalOperators;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class night5 {

    public static void main(String[] args) {

        /*
        2.  Write a Java program to implement following logic using
        if statement1. if hour is less than 12 noon,
        greet with Good Morning2.  if hour is greater than or
        equal 12 noon but less than 3 pm, greet with Good Afternoon3.
        if hour is greater than or equal to 3 pm, greet with
        Good Evening
         */
        byte hour = 6;
        byte minute = 59;


        if (hour< 12) {
            System.out.println(" Good morning! It is "
                    + hour +":"+ minute + "am");}
            if (hour>=12 && hour<15) {
                System.out.println( " Good afternoon! It is" + hour +
                        ":" + minute+ "pm");}
            if( hour>=15 && hour<24){
                System.out.println(" Good evening! It is "+
                    hour+ ":" +minute + "pm"); }
        }
    }


