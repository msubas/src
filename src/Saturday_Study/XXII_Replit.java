package Saturday_Study;

public class XXII_Replit {

    public static void main(String[] args) {
       isEven(9);
    }
    public static boolean isEven(int n){ //This is a boolean method and we are going to find that which number is
                                         // even number
        if(n%2==0){
            System.out.println(true);
            return true;
        }
else {System.out.println(false);
            return false;
        }}}

/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
 */