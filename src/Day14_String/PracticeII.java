package Day14_String;

import java.util.Scanner;

public class PracticeII {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                   String ValidUsername="cybertek";
            String ValidPassword= "cybertekschool1!";

            System.out.println("Enter a username");
            String username=input.next();
            System.out.println(" Enter your password");
            String password=input.next();

            boolean a= username.equals(ValidUsername);
            boolean b= password.equals(ValidPassword);



        if(a==true && b==true){
            System.out.println("Welcome to the program");}
        else if(a==false && b==false){System.out.println("Incorrect user name and " +
                "password");}
            else if (a=true && b==false){
                System.out.println("incorrect password");}

            else if (a==false && b==true){
                System.out.println("Incorrect user name");}



           }}