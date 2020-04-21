package Day10_SwitchandSCanner;
import java.util.Scanner;
public class ScannerTASK {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int number1= input.nextInt();
        System.out.println("Enter your second number: ");
        int number2= input.nextInt();
        System.out.println("Enter your third number: ");
        int number3= input.nextInt();

        int result= (number1>number2 && number1>number3)?
number1 : (number2>number3 && number2>number1)? number2:
        (number3 >number1&&number3>number2)? number3: 0;


        System.out.println("Your biggest number is: "
        + result);


}}
