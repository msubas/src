package Day26_MethodOVERLOADING;

import java.util.Scanner;

public class VII_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your String number");
        int num = scan.nextInt();
        fib(num);}
    public static void fib(int num){

        int [] arr=new int[12345678];
        arr[0]=0; arr[1]=1;
        for (int i=2;i<arr.length;i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (i>=num) {
                System.out.println(arr[i]);
               break;
            }}}}


