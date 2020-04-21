package ZPracticeSamples;

import java.util.Scanner;

public class LOOPS_FindingtheMAXnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = -999999999;// We need a number in order to compare our entries. Therefore I picked a number which was the
                            //number that I assumed the user is not going to enter any smaller one.
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {  //I want to enter 5 numbers so my loop is going to stop after the 5th one
            //System.out.println("Enter a number");
            int m = input.nextInt();//m is representing the user's enterie
            if (m > a) {
                a = m;}}
        System.out.println(a + " is the biggest number");
            }}



