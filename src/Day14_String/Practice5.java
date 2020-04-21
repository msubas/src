package Day14_String;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a password");
        String a=input.next();


if (a.contains("?,!,%, ")){
    System.out.println("you must use ?,! or %");
}
    }
}
