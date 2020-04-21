package Saturday_Study;

import java.util.Scanner;

public class IV_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int x = 0;

        System.out.println("Enter a number");

        int a = input.nextInt();


        for (int i = a; 0 <= i; i--) {

            System.out.println(a + " times " + (i) + " = " + (a * i));
            x += (a * (i));
        }
        System.out.println("Total of the results are=" + x);

    }
}
