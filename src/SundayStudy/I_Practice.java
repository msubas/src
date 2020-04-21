package SundayStudy;

import java.util.Scanner;

public class I_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Sender Name");
        String a=input.next();
        System.out.println("Phone number");
        String b=input.next();
        System.out.println("Your message");
        String c=input.next();

        System.out.println("Sender name:"+ a);
        System.out.println("Phone number:"+b.concat(b));
        System.out.println("Your message:"+c.concat(c));

    }

}
/*
Sender:<Mike Smith>. From Number:[202-123-3456].
Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string
and assign to those 3 variables.
-print each variable in separate line

 */