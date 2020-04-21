package Day16_LOOPS;

import java.util.Scanner;

public class VI_MorningTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=input.nextInt();
        int sum=0;

        for(int i=1; i<=a ; i++){
            sum+=i;


        }
        System.out.println(sum);
        System.out.println(((a*(a+1)/2))); }}

