package day17_d0WHILEDOloop;

import com.sun.jmx.snmp.agent.SnmpTableCallbackHandler;

import java.util.Scanner;

public class VI_WHileLOOP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter yes or no");
        String word=input.next();

        boolean valid=word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no");
        while(!valid){
            System.out.println("Please re enter");
        word=input.next();
        if(valid=word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no")){
            break;}}

        if(word.equalsIgnoreCase("yes")){
            System.out.println("You entered yes");}
        if (word.equalsIgnoreCase("no")){
            System.out.println("You entered no");}

        }}
/*

Ask the user yes or no question

if user enters something other that yes or no
repeat the question
 */