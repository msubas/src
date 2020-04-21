package SundayStudy;
import java.util.Scanner;
public class III_Practice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter a word");
        String a=input.next();

        String ch= "";

        boolean b=a.contains("java")== true;
        boolean c= a.substring(0,2).contains(ch)==true;
        boolean d= a.substring(a.length(),a.length()-1).contains(" ")==true;

        if(b&&c&&d){
            System.out.println("True");
        }



    }}



       /*if( a.startsWith("Java") && a.contains("Java")||a.contains("java"))

        System.out.println("True");
        else{
           System.out.println("False");
    }}}
*/