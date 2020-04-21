package Day15_LOOPSS;

import java.util.Scanner;

public class VIII_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String a = input.next();
        int lastIndexnum = a.length() - 1;
        String R = "";
        for (int i = lastIndexnum; i >= 0; i--) {
            R += a.charAt(i);

        }
        boolean x= a.equalsIgnoreCase(R);
        if (x) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(R);

     }}
