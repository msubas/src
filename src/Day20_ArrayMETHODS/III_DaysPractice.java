package Day20_ArrayMETHODS;

import java.util.Scanner;

public class III_DaysPractice {
    public static void main(String[] args) {
        String [] days={"mon","tue","wed","thu","fri",
                "sat","sun"};
        Scanner input=new Scanner(System.in);
        System.out.println( "Enter a number");
        int num=input.nextInt();
        while(num>7||num<0){
            System.out.println("Invalid entery");
            System.out.println( "Enter a number");
             num=input.nextInt();
        }
        String day= days[num-1];
        System.out.println(day);
    }}
