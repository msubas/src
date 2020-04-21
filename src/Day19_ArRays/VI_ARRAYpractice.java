package Day19_ArRays;

import java.util.Scanner;

public class VI_ARRAYpractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] students = new String[10];

        for (int m = 0; m < students.length; m++) {
            System.out.println("Please enter your name:");
            students[m] = input.next();}

        for (int s = 0; s < students.length; s++) {
            System.out.print(" "+ students[s]);
    }}}
