package Saturday_Study;

import java.util.Scanner;

public class XI_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Cusername = "CyberTek@gmail.com";
        String Cpassword = "JavaBueaties";

        System.out.println("Enter your email address");
        String username = input.next();


        System.out.println("Enter your password");
        String password = input.next();

        if (username.equalsIgnoreCase(Cusername)) {
            if (!(username.endsWith("@gmail.com"))) {
                System.out.println("Invalid user name");
            }
        }
        if (!(Cpassword.equals(password))) {
            System.out.println("Invalid Password");
        }

        if((username.endsWith("@gmail.com") && username.equals(Cusername)&& Cpassword.equals(password))){
            System.out.println("welcome");}
        else{
            System.out.println("Invalid user name or password");

        }

    }
}