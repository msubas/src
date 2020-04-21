package SundayStudy;

import java.util.Scanner;

public class PaitentPortal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Cybertek Patient Portal");
        System.out.println("Please enter your personal information");
        System.out.println(" Enter your first name");
                String name=input.next();
        System.out.println(" Enter your last name");
        String Lname=input.next();
        System.out.println(" Enter your email address");
        String email=input.next();
        System.out.println(" Street Number");
        int SNN=input.nextInt();
        System.out.println(" Enter your Street name");
        String Street=input.next();
        System.out.println(" City");
        String city=input.next();
        System.out.println(" State");
        String state=input.next();
        System.out.println(" zip Code");
        int zip=input.nextInt();
        System.out.println("Work Phone number");
        long WPN=input.nextLong();
        System.out.println("Cell Phone number");
        long CPN=input.nextLong();
        System.out.println("age");
        int age=input.nextInt();
        System.out.println("Weight");
        double Weight=input.nextDouble();
        System.out.println("Height");
        double height=input.nextDouble();
        System.out.println("Are you married");
        boolean ma=input.nextBoolean();
        /*
        Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
         */
        System.out.println("Full name: "+", "+ Lname+name);
        System.out.println("Address: " +SNN+" "+ Street + " "+city+","+ state+ ","+ zip);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+ Weight);
        System.out.println("Married?: "+ ma);



    }
}
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt "Welcome to the patient portal!"
-Display prompt "Please enter your personal information"

-Display prompt "Enter your first name"
James

-Display prompt "Enter your last name"
May

-Display prompt "Enter your email"
jamesmay@gmail.com

-Display prompt "Enter your street"
7925 Jones Branch Dr

-Display prompt "Enter your city"
McLean

-Display prompt "Enter your state"
VA

-Display prompt "Enter your zip code"
22102

-Display prompt "Enter your work phone number"
7896542314

-Display prompt "Enter your personal phone number"
2406542314

-Display prompt "Enter your age"
35

-Display prompt "Enter your height"
5.10

-Display prompt "Enter your weight"
173.2

-Display prompt "Are you married?"
true



-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true


 */