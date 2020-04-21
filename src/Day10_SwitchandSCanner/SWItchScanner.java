package Day10_SwitchandSCanner;
import java.util.Scanner;

public class SWItchScanner {
    public static void main(String[] args) {
        /*
import java.util.Scanner===> import statement
place after the package
methods of Scanner==>
nextByte():==> Allows user to enter byte value

         */
Scanner input= new Scanner(System.in);
        System.out.println(" Enter a number");
byte num1= input.nextByte();
        System.out.println("You have entered " + num1);
if (num1%2==0){
    System.out.println("Even");}
    else{
        System.out.println("odd");}
    }
}


