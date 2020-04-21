package Day25_Method;

public class XV_Replit {
        public static void main(String[] args) {
            threeLocks(false,false,true);}
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if (a && b == true || c == true) {
            System.out.println("true");
        } else {
            System.out.println("false");}
        return a;
    }}
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */