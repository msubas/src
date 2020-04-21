package Day10_SwitchandSCanner;
import java.util.Scanner;
public class ScannNerShort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Enter Your Salary: ");
        double num1= input.nextDouble();
        System.out.println(" Daily work hour? : ");
        double num2= input.nextDouble();


        System.out.println("Your Hourly Rate is " + (num1)/(num2*52*5));
    }

}
