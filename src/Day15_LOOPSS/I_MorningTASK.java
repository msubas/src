package Day15_LOOPSS;

import java.util.Scanner;

public class I_MorningTASK {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first word");
        String a=input.next();
        System.out.println("Enter the second word");
        String b=input.next();

        System.out.println(a.charAt(0) + b.substring(0,1));
/*
String initials=""+a.charAt(0)+b.charAt(0);
This is another solution . we put "" to the begining because
our expected result is String so in order to get String
we gave "" to the beginning

            String initials = firstName.substring(0,1).toUpperCase() +  lastName.substring(0,1).toUpperCase();
             //    initials = initials.toUpperCase();


        String initials = "" + firstName.charAt(0) + lastName.charAt(0);  // returns string

        initials = initials.toUpperCase();

 */


    }
}
