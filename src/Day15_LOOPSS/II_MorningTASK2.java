package Day15_LOOPSS;

import java.util.Scanner;

public class II_MorningTASK2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");
        String a=input.next();
        System.out.println("Enter your password");
        String b=input.next();

        if (a.endsWith("@gmail.com")) {
            if (a.contains("cybertek18@gmail.com") && b.contains("JavaBeuties")) {
                System.out.println("Welcome to the program");
            } else {
                System.out.println("Invalid username or password");
            }
        }
        else{
            System.out.println("it is not a gmail account"); ;}


        }

    }
