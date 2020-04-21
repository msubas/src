package Saturday_Study;

import java.util.Scanner;

public class XIII_Practice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a name");
        String name=input.next();
        String c="";
        int a=name.length();
        int b= 0;

       while (a>b){
            //c+=name.charAt(a);
            //System.out.println(b);
           b++;
            c+=name.charAt(a-b);
        }
        System.out.println(c);
    }
}
