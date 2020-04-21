package SundayStudy;

import java.util.Scanner;

public class coupone {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Enter the number of coupons:");
        int coupons = input.nextInt();

        int Candies = coupons / 10;
        int GumBalls =  (coupons % 10) / 3;
        if (coupons > 0){
            System.out.println ("Number of Candies: " + Candies);
            System.out.println ("Number of Gumballs: "+ GumBalls);
        }else {
            System.out.println ("Not enough coupons");}}}
