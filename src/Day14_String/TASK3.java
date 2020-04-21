package Day14_String;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first word");
        String fw=input.next();
        System.out.println("Enter the second word");
        String sw=input.next();

        String fsw=fw.concat(sw).concat(sw).concat(fw);

        System.out.println(fsw);
    }

}


/*
Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone

 */