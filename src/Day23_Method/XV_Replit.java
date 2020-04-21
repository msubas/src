package Day23_Method;


import java.text.DecimalFormat;
import java.util.Scanner;

public class XV_Replit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i == 0; ) {


            System.out.println("                 ****Welcome to the Cybertek Ultimate Calculator****");
            System.out.println("                    Please select your calculation option");
            System.out.println(" For Km to miles enter 1   " + " For Gallon to Liter enter 2   " + " Calculator enter 3   " +
                    " For Gradebook enter 4");

            int selection = input.nextInt();
            if (selection == 1) {
                KmToMiles();
            }
            if (selection == 2) {
                gallons2litters();
            }
            if (selection == 3) {
                SimpleCalculator();
            }
            if (selection == 4) {
                LetterGrade();
            }

            System.out.println("Do you wanna continue?");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                {
                    break;


                }
            }
        }}

        public static void KmToMiles () {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter your Km data");
            double KM = input1.nextDouble();

            System.out.println(KM + " equals to " + (KM * 0.612) + " miles");


        }

        public static void gallons2litters () {

            DecimalFormat DF = new DecimalFormat("0.00");

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter your Gallon amount");
            double gallonamount = input2.nextDouble();

            double Alitter = 3.785;
            double G2Lit = Alitter * gallonamount;
            System.out.println(gallonamount + " gallon equals to " + DF.format(G2Lit) + " liter");


        }

        public static void SimpleCalculator () {


            Scanner input = new Scanner(System.in);


            for (int i = 0; i == 0; ) {


                System.out.println("Enter the First number");
                int FN = input.nextInt();
                System.out.println("Enter the Second number");
                int SN = input.nextInt();
                System.out.println("Enter your operator");
                char op = input.next().charAt(0);


                if (op == '+') {
                    System.out.println(FN + SN);
                } else if (op == '-') {
                    System.out.println(FN - SN);
                } else if (op == '*') {
                    System.out.println(FN * SN);
                } else if (op == '/') {
                    System.out.println(FN / SN);
                } else if (op == '%') {
                    System.out.println(FN %= SN);
                } else {
                    System.out.println("invalid Operator");
                }

                System.out.println("Do you wanna continue?");
                String answer = input.next();

                if (answer.equalsIgnoreCase("no")) {
                    {
                        break;
                    }
                }
            }
        }


        public static void LetterGrade () {

            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter your grade");
            double grade = input4.nextDouble();

            if (grade < 100.1) {

                if (grade >= 90 && grade <= 100) {
                    System.out.println(" Your grade is A");
                } else if (grade > 100) {
                    System.out.println(" See your teacher for your grade");
                } else if (grade >= 80 && grade < 90) {
                    System.out.println("your grade is B");
                } else if (grade >= 70 && grade < 80) {
                    System.out.println("Your grade is C");
                } else if (grade >= 60 && grade < 70) {
                    System.out.println("Your grade is D");
                } else {
                    System.out.println("Your grade is F");
                }
            } else {
                System.out.println("Invalid Entery");
            }
        }
    }

/*
    warm up tasks:
        1. write a method called KmToMiles that can convert km to miles
        1 km = 0.612 miles
        2. write a method called GalonsToLitters, that can convert gallons to litters
        1 G = 3.75 L
        3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;
        4. write a method called Grade, that can print out the grade based on the score of the student
        if score is 100 ~ 90 ==> A
        if score is 89 ~ 80 ==> B
        if score is 79 ~ 70 ==> C
        if score is 69 ~ 60 ==> D
        if score is 0 ~ 59 ==> F
        otherwise ==> Invalid Score
        Ex:
        Grade(100); ==> A
        Grade(120); ==> Invalid
*/
