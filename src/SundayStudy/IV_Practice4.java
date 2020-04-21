package SundayStudy;

import java.util.Scanner;

public class IV_Practice4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String result="";
        System.out.println("Enter a word");
        String word=input.next();
        int wordL=word.length();

        int middleL=wordL/2;
        int nextmiddle = (wordL+1)/2;
        String m=word.substring(middleL-1,middleL+1);
        String n=word.substring(nextmiddle-1,nextmiddle);
        if(wordL%2==0){
            System.out.println(m);}
        else{
            System.out.println(n);}




    }}
