package SundayStudy;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("   Welcome to the CyberMART");
        System.out.println(" Please enter item 1 and price");

        String item1=input.next();
        double price1=input.nextDouble();

        System.out.println(" Please enter item 2 and price");
        String item2=input.next();
        double price2=input.nextDouble();

        System.out.println(" Please enter item 3 and price");
        String item3=input.next();
        double price3=input.nextDouble();
      //Item1: Tomatoes Price: 5.5,
        System.out.println("Item1: "+ item1+" Price: "+price1+","+
                "Item2: "+ item2+" Price: "+price2+"," +"Item3: "+ item3+" Price: "+price3);
        System.out.println("Total Price: " +(price1+price2+price3));
        System.out.println(" Thank you for choosing CyberMART");


    }
}
/*
In this assignment you will write a program to create
a shopping list and prices.
You will use Scanner object and ask user to enter
3 items followed by its price and you will
calculate total price and show as a report.
-Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3,
 totalPrice
-Create a Scanner object named scan.
Execution flow with example:
-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5
-Display prompt "Enter Item2 and its price:"
Cheese
3.5
-Display prompt "Enter Item3 and its price:"
Apples
6.3
-calculate totalPrice for all items
-build the report variable by concatenating Strings and double values:
"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"

- Print the value of report variable




 */