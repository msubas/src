package Day23_Method;

public class VIII_Methods_WithParameters {
    public static void main(String[] args) {
        String names = "Mehmet";
        ReverseString(names);

        System.out.println("\n"+"Hello");

        System.out.println();}

    public static void ReverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)); }}}
/*

create a function that can print out max number from the any
given Array

and

min number

and

order numbers descending order
[1,2,3]===> [3,2,1]


 */