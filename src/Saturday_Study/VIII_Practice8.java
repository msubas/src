package Saturday_Study;

import java.util.Scanner;

public class VIII_Practice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        for (int i =0; i <5; i++){
            System.out.println("Enter a word");
            String count = input.nextLine();
            if(count.length()>result.length()){
                result = count;
            }
        }
        System.out.println("The longest word is: "+ result);
}}
