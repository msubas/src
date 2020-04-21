package Day14_String;

import java.util.Scanner;

public class webadressvalidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the website for validation");
        String a = input.next();

        if (a.startsWith("www") && a.endsWith(".net") || a.endsWith(".gov") || a.endsWith("edu")) {
            System.out.println("Valid address");}
        else{
            System.out.println("invalid address");

    }

}

}
