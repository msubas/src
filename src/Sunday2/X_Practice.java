package Sunday2;

import java.util.Scanner;

public class X_Practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first and last names and age");
        String s = inp.nextLine();
        person(s);
    }
    public static void person(String info) {
        String [] Split = info.split(",");
        String result = "person name: " + Split[0] + " last name: " +
                Split[1] + " age: " + Split[2];
        System.out.println(result);
    }
}


