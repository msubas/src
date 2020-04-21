package day12_ReviewScanner;

import java.util.Scanner;

public class PRACTICESANNER {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String fullAddress = "";

        System.out.println("Enter the number of the building: ");
        short Bnumber =  input.nextShort();
        fullAddress += Bnumber+" ";  // fullAddress = fullAddress+Bnumber+" "

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType = input.next();
        fullAddress += roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state+", ";

        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: " + fullAddress);

   }


}

/*

next():Returns String and takes the only first word
nextln
Close

 */

