package Day11ScannerCONT;

import java.util.Scanner;

public class NextlinePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        System.out.println(" Enter your age: ");
     input.nextInt();
        System.out.println("Enter your full name");
        String fullname=input.nextLine();
        System.out.println("Your full name is"+ fullname);



    }

}
