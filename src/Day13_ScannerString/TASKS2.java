package Day13_ScannerString;

import java.util.Scanner;

public class TASKS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        int buildingnumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Street adress");
        String streetadress = input.nextLine();
        System.out.println("Enter your city name");
        String cityname = input.next();
        System.out.println("Enter your state name");
        String statename = input.next();
        System.out.println("Enter your zip code");
        int zipcode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullname = input.nextLine();
        System.out.println("Ship to: "+fullname + "\n" +"         "+ buildingnumber + " " + streetadress + "\n" + "         "+cityname + ", " + statename + " " + zipcode);
    }}