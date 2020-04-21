package Day21_StringMethods_MultidimentionalARRAYS;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.Scanner;

public class XXI_Replit2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i < words.length; i++) {

            String eachWords = words[i];// In this Step I converted the each Array element to String
            String m = eachWords.substring(0, 1);//In this step,I took the first index character from each String element
            String n= eachWords.substring(eachWords.length()-1, eachWords.length());// In this step,I took the last index character
                                                                                    // from each String element
            System.out.print(m+n+ " ");// I concatenate two strings and print them
        }
    }}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
 */