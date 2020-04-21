package SundayStudy;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectname1=input.next();
        double grade1= input.nextInt();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subjectname2=input.next();
        double grade2= input.nextInt();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectname3=input.next();
        double grade3= input.nextInt();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectname4=input.next();
        double grade4= input.nextInt();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectname5=input.next();
        double grade5= input.nextInt();
//Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4
        System.out.println("Summary: "+ subjectname1+ " - " +grade1+", "+ subjectname2+ " - " +grade2+", "+ subjectname3+ " - " +grade3+", "+
                subjectname4+ " - " +grade4+", "+subjectname5+ " - " +grade5+",");
        System.out.println("Your average score is: " + (grade1+grade2+grade3+grade4+grade5)/5);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


            }

}
/*
-Display prompt :"Welcome to the Grader!"
-Display prompt: "Please enter subject name number 1 and score for this subject"
Math
5.0
-Display prompt: "Please enter subject name number 2 and score for this subject"
Biology
4.2
-Display prompt: "Please enter subject name number 3 and score for this subject"
English
4.4
-Display prompt: "Please enter subject name number 4 and score for this subject"
Chemistry
4.8
-Display prompt: "Please enter subject name number 5 and score for this subject"
Music
3.4
-build summary variable by concatenating subject names and grades
calculate average score and define that value into average variable.
-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
-Display prompt: "Your average score is: 4.36"
-Display prompt: "Thank you for using Grader!"
-Display prompt: "Goodbye!"
 */