package Saturday_Study;

public class XVIII_Practice {
    public static void main(String[] args) {

        String a = "coronavirus";

        String reverse = "";


        int lengthA = a.length();
        System.out.println("length of the String a is: " + lengthA);


        for (int i = lengthA; i > 0; i--) { //run the below code 17 times

            reverse += a.charAt(i-1);
                       // take the character 16 from the String a and + to the String reverse ""
        }


        if (reverse.equals(a)) {
            System.out.println(reverse + " is A Palindrome word");
        } else {
            System.out.println(reverse + " is Not a Palindrome Word");
        }
    }
}

/*
0123
WORD
1234

0123
DROW
1234


a-----------b


 */