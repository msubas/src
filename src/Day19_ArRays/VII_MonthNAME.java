package Day19_ArRays;



import java.util.Scanner;

public class VII_MonthNAME {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] Months = new String[13];
        for (int m = 1; m < Months.length; m++) {
            System.out.println("Please enter your month:");
            Months[m] = input.next();}

        for (int s = 1; s < Months.length; s++) {
            System.out.println(s+"."+"Month name is " +Months[s]);
        }}}




//MonthName