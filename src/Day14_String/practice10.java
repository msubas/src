package Day14_String;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a word");
        String a = input.next();
        if(a.charAt(0) == a.charAt(a.length()-1))
        {System.out.println("True");}
        else{System.out.println("False");}}}




/*
Ask user to enter a word. Print true is the
first and last characters of the string are
same characters, print false otherwise.
			Input:
				abba
			Output:
				true
4. Ask user to enter a word. Print "really?"
 if the word ends with ly,
 print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */