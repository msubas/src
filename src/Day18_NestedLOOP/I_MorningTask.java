package Day18_NestedLOOP;

import java.util.Scanner;

public class I_MorningTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter a number");
        int a=input.nextInt();

        System.out.println("Enter a number");
        int b=input.nextInt();

        int c=a/b;
        int d=a%b;

        while(a>=b){
            System.out.println("a/b= "+c+ " and reminder is "
            + d);
            break;

        }



    }
}
