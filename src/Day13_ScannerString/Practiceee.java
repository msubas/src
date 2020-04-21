package Day13_ScannerString;

import java.util.Scanner;

public class Practiceee {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname=input.nextLine();

        String firstname=fullname.substring(0,fullname.indexOf(" "));
        String Lastname=fullname.substring(fullname.indexOf(" ")+1);

        firstname= firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        Lastname= firstname.substring(0,1).toUpperCase()+ Lastname.substring(1).toLowerCase();

        System.out.println(firstname);
        System.out.println(Lastname);


    }
}
