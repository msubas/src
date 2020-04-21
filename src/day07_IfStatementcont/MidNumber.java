package day07_IfStatementcont;

public class MidNumber {
    public static void main(String[] args) {
        {
            int a = 250;
            int b = 200;
            int c = 222;

            boolean midA = ( a < b && a > c) || ( a > b && a < c );
            boolean midB = ( b < c && b > a) || ( b > c && b < a );
            boolean midC = ( c < b && c > a) ||  ( c > b && c < a);


            if (midA) {
                System.out.println(a + " is the midNumber");
            }
            if (midB) {
                System.out.println(b + " is the midNumber");
            }
            if (midC) {
                System.out.println(c + " is the midNumber");
            }


        }
    }}