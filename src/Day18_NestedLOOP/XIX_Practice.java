package Day18_NestedLOOP;


import java.util.Scanner;

public class XIX_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        String m = "" + "Double Bed" + "\n" + "" + "Total cost is: $100+TAX";
        String n = "" + "Single Bed" + "\n" + "" + "Total cost is: $80+TAX";
        String question = "Do you want to reserve another room?";
        System.out.println("Welcome to the hotel Califonia");
        System.out.println("\n" + "  Please select a your room" +
                "\n" + "**********************************" +
                "\n" + "Single bed=$80/night===>Enter 1" +
                "\n" + "Double bed=$100/night===>Enter 2" +
                "\n" + "King bed=$120/night/===>Enter 3");
        int a = input.nextInt();
        if (a == 1) {System.out.println(n); }
        if (a == 2) {System.out.println(m); }
        if (a == 3) {System.out.println("" + "King Bed" + "\n" + "" +"Total cost is: $120+TAX"); }
        if(a>3){ System.out.println("Invalied Entery");}
          System.out.println(question);
          String C = input.next();
          if(C.equalsIgnoreCase("yes"));
          if (C.equalsIgnoreCase("no")) {
              System.out.println("Thank you for choosing us");
             }}}}
           /*
 Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter

 */