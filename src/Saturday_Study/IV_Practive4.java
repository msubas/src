package Saturday_Study;

import java.util.Scanner;

public class IV_Practive4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the parameter 1");
        String a=input.next();
        System.out.println("Enter the parameter 2");
        String b=input.next();
        String A="A";
        A="a";
        /*String B="B";
        String C="C";
        String D="D";
        */
        if (a.contains(A) && b.contains(A)){
            System.out.println("You found A");}
        if(a.contains(A) && b.contains("B")){
            System.out.println("Turn right B found" );}
        if(a.contains(A)&&b.contains("C")){
            System.out.println("TurN right from A,turn right from B" +
                    ", you found C");}
        if(a.contains(A)&& b.contains("D")){
            System.out.println("TurN right from A,turn right from B, " +
                    "turn right from C, you found D");}
        if(a.contains("B") && b.contains("B")){
            System.out.println("You found B");}
        if (a.contains("B") && b.contains("C")){
            System.out.println("Turn right from B you found C");
        }
        if (a.contains("B")&& b.contains("D")){
            System.out.println("Turn right from B, turn right from C, you found D");
        }
        if (a.contains("C")&& b.contains("C")){
            System.out.println("You are at C");}
        if (a.contains("C") && b.contains("D")){
            System.out.println("Turn right from C , you found D");}

        if (a.equalsIgnoreCase("D")&&b.equals("D")) {
            System.out.println("You are at D");

        } }


}



/*
Write a program that will print out route
instructions. Your program should take 2 parameters:
start point and end point. Use left,
right, up and down for navigation. Insert ">"
between commands. If start point equals to end point -
display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
 */