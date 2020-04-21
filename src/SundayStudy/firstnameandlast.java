package SundayStudy;

import java.util.Scanner;

public class firstnameandlast {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name");
 String FN= input.next();
        System.out.println("Enter your last name");
        String LN=input.next();

        System.out.println( FN +" "+ LN);
    }
}
