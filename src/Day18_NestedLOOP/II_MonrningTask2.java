package Day18_NestedLOOP;

import java.util.Scanner;

public class II_MonrningTask2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int num = input.nextInt();
        double result=1;

        while (num >= 1) {
            result = result*num;
            num--;}
        System.out.println(result);
    }
    }

