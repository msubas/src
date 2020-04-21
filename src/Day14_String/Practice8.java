package Day14_String;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first word");
        String a= input.next();
        System.out.println("Enter the second word");
        String b= input.next();
        System.out.println("Enter the third word");
        String c= input.next();

        if(a.length()==b.length() && a.length()==c.length()){
            System.out.println(" first, second and third word have same lenght");
        }
        else if (a.length()==b.length() || a.length()==c.length()|| b.length()==c.length()){
            System.out.println("Two words have same lenght");
        }
        else{
            System.out.println("Words's lenght are not equal to each other");

    }}
}

/*
1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:
	print "All words are same length"
	- if some same length and others not:
	print "Not Same nor Different lengths"
	- if all different length :
	print "All different length"
 */
