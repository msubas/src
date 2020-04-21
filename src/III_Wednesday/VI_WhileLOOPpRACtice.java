package III_Wednesday;

import java.util.Scanner;

public class VI_WhileLOOPpRACtice {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-999999999;
        int min=999999999;
        int i=0;
        while(i<3){
        System.out.println("Enter a number");
        int num=input.nextInt();
        if(num>max)
            { max=num;
                }
        //if(num<min){
                  i++;
    }
        System.out.println(max+" is the max number");
        // System.out.println(min+" is the min number");
        //
    }}
