package Day14_String;

import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String a = input.next();
        System.out.println("Enter your second word");
        String b = input.next();


        if (a.length() == 5 && b.length() == 5 ){

        if (a.endsWith("") == b.startsWith("")) {
            System.out.println("fizz");}
        else{
            System.out.println("buzz");}
        }
else {
            System.out.println("need to be exactly 5 chars length");

}
    }}

/*
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters,
	and check if last letter of first word and
	first letter of second work are same.
		if either one not 5 chars length:
		 print "need to be exactly 5 chars length"
		if last letter of 1st word and first
		letter of 2nd word match:  print "Fizz"
		if they do not match:  print
		"Buzz - did not match"
 */