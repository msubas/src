package Day14_String;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first word");
        String fw=input.next();
        System.out.println("Enter the second word");
        String sw=input.next();

        String fsw= fw.substring(1).concat(sw.substring(1));
        System.out.println(fsw);
    }

}

/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
 */
