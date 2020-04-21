package Day23_Method;

import java.util.Scanner;

public class XI_Replit {

    public static void main(String[] args) {

        plus();
    }

    public static void plus() {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=input.nextInt();
        System.out.println("Enter second number");
        int b=input.nextInt();

        System.out.println("result: "+ (a+b));

    }
}

/*

create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */