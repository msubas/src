package Day11ScannerCONT;

import java.util.Scanner;

public class Practice_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Name;");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String LastName = input.next();

        String fullName = firstName + " " + LastName;


        System.out.println(" Employement Status");
        boolean employmentStatus = input.nextBoolean();

        if (employmentStatus == true) {
            System.out.println("Enter you salary: ");
            double salary = input.nextDouble();
        }
        System.out.println("Full name: " + fullName);
        System.out.println("Employee Status: " + employmentStatus);
        System.out.println("salary: " );

    }
    }

/*
user name
last name
asked employed or not
if employed ask the salary
If he is not salary set the salary as "0"
output
Full name
Employee Status
Salary
*/