package Day14_String;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.next();

String mCH="";

int totalChars=word.length();  // araba --- 5/2=2 1 arabam
int middlenumber=totalChars/2;
        if (totalChars%2 !=0){
            mCH+=word.charAt(middlenumber);

        } else{mCH=mCH+word.charAt(middlenumber-1)+word.charAt(middlenumber);}
        System.out.println(mCH);




}}
/*
Write a Java method to display the middle character of a string
 a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
  Input :
  elephant
    Output:
     The middle character in the string: ph

 */