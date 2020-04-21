package SundayStudy;

import java.util.Scanner;

public class SecondMinute {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" Enter number of seconds");
        int number=input.nextInt();
        int sec= number%60;
        int min= number/60;
        int min2=min%60;
        int hour=min/60;

        System.out.println(hour+" Hour "+min2+" minute "+sec +" second");

        /*
        1 hour=3600 sec
        1 min= 60 sec

         */


    }
}
