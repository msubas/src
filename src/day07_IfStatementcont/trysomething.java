package day07_IfStatementcont;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class trysomething {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username and Password");

        String userName= input.next();
        String password= input.next();
        String validusername= "Superman";
        String validpassword= "abc123";

        if(userName.equals(validusername)&& password.equals(validpassword))
        {
            System.out.println(" Access granted. Welcome Agent :) ");}
        else {
            System.out.println("Access Denied - This laptop is going to destroy " +
                            "within 5 seconds..."
                    );}



    }
}