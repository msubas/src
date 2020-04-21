package SundayStudy;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class midnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        double n1 = input.nextDouble();
        System.out.println("enter the second number");
        double n2 = input.nextDouble();
        System.out.println("enter the third number");
        double n3 = input.nextDouble();

        if ((n1==n2 && n1==n3)|| (n1==n2 &&n2==n3) ) {
            System.out.println("numbers are equal to each other");
        }
        else {
if ((n1>n2 && n3>n2 )|| (n1>n3 && n2>n1)) {
    System.out.println(n1 + " is the middle number");}

else {
    if ( (n2>n3 && n3>n1)||(n3>n2 && n1>n3)) {
    System.out.println(n3 + "is the middle number");
    }}}}}