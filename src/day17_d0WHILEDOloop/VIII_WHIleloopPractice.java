package day17_d0WHILEDOloop;

import java.util.Scanner;

public class VIII_WHIleloopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String UN = input.next();

        System.out.println("Enter your password");
        String PW = input.next();

        while (!(UN.equals("cybertek") && PW.equals("cybertek123"))) {
            System.out.println("re-enter your user name and password");

        System.out.println("Enter your username");
        UN = input.next();

        System.out.println("Enter your password");
        PW = input.next();
    }
        System.out.println("logged in");
    }
}



/*
user name:cybertek
pw=cybertek123
 */