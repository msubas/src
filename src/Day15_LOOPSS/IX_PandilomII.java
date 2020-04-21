package Day15_LOOPSS;

import java.util.Scanner;

public class IX_PandilomII {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a Word: ");
        String a = Input.nextLine();

        System.out.println("Reverse of word '" + a + "' is  :");
        String str2="";

        for (int i = a.length(); i > 0; --i) {
            System.out.print(a.charAt(i - 1));}
        //boolean result = a.equalsIgnoreCase(str2);
       
    }}
