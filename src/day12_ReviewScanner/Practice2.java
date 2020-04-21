package day12_ReviewScanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Building Number");
        int BuildingNumber= input.nextInt();

        input.nextLine();

        System.out.println("Street name: ");
        String street= input.nextLine();

        System.out.println("Enter your zip code");
        int zip= input.nextInt();
        input.nextLine();
        System.out.println("City and State Name");
        String cityandstate=input.next();

        System.out.println("Building Number: "+ BuildingNumber +
                " Street Name: "+ street+ " Zip code is: "+
                zip + " City and State "+ " , " + cityandstate);






    }
}
