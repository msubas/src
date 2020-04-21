package Day11ScannerCONT;
import java.util.Scanner;
public class MonrningTASK {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Enter Your Salary: ");
        double num1= input.nextDouble();
        System.out.println(" Enter Federal tax rate : ");
        double num2= input.nextDouble();
        System.out.println(" Enter State tax rate : ");
        double num3= input.nextDouble();
       System.out.println("Your net salar is "
                + (num1-((num1*num2/100)+(num1*num3/100))));
    }

}

        /*
        Write a program that can calculate the
        salary after tax
                needed informations:
                employee' salaray
                state tax
                 federal tax

         */




