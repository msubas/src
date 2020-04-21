package Day14_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String ValidUsername="cybertek";
        String ValidPassword= "cybertekschool1!";

        System.out.println("Enter a username");
        String username=input.next();
        System.out.println(" Enter your password");
        String password=input.next();

        if(username.equals(ValidUsername)&& password.equals(ValidPassword)){
            System.out.println("Welcome to the program");
        }
        else{
            System.out.println("Invalid Username and/or password");}
    }
}
