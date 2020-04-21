package ZPracticeSamples;


public class LOOPS_PaLINDROMe {
    public static void main(String[] args) {
/*
                    Palindrome Words

    At the end of this video you will be able to ;

1-Find the reverse version of the original String : System.out.println(reverse);
2- Find the Length of the original word :int originalL = original.length();
3- Find the Maximum index number of the original String:  int maxIndexnumber = originalL - 1;
4- Write  the for loop code: for (int i = originalL; i > 0; i--) { reverse += original.charAt(i - 1);}
5-Concat the characters from original String  to Reverse String
6- Write if and else statements

        if (reverse.equals(original)) {
            System.out.println(original + " is a palindrome word");
        } else {
            System.out.println(original + " is not a palindrome word");
        }
7- Find out if the word is a palindrome word or not: XXXXXXX is not a palindrome word
8- Use equalsIgnoreCase to compare to words
 */

        String original = "Muhtar";

        String reverse = ""; //Always, I need an empty String in order to concat my characters from original string to the reverse string
        // our character assignment is going to start from the max index number of the original string therefore I am going to find my
        // Strings length first

        int originalL = original.length();
        System.out.println(originalL); // the length of my String is 6
        int maxIndexnumber = originalL - 1;
        System.out.println(maxIndexnumber);// the maximum index number is 5

        for (int i = originalL; i > 0; i--) {
            //Think like a countdown because I am starting from the last index number
            //I can type a number here however String can be longer than the current one so
            // the best way is to use the length  )
// I am going to tell the system how many times I want the system repeat the below code


            reverse += original.charAt(i-1);
            //here- I am starting my concatenation

        }
        System.out.println(reverse);
        if (reverse.equalsIgnoreCase(original)) {
            System.out.println(original + " is a palindrome word");
        } else {
            System.out.println(original + " is not a palindrome word");
        }
    }
}

