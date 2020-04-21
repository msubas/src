package Wednesday3;

import java.util.Arrays;

public class III_StringMethods {
    public static void main(String[] args) {
// StringMethods
        String str= "Cybertek";
        char[] ch1=str.toCharArray();
        System.out.println(str.length()==ch1.length);

        System.out.println("+++++++++++++++++++++++++++");

        String  str1="abc";// str 1= "abc" & str2="cab" are they made from same characters?
        String  str2="cab";

        char [] c1= str1.toCharArray();
        // System.out.println(Arrays.toString(cha1)); [a, b, c]
        char [] ch2=str2.toCharArray();
        //System.out.println(Arrays.toString(ch2)); [c, a, b]
        Arrays.sort(c1);  //[a, b, c]
        Arrays.sort(ch2);  //[a, b, c]

        System.out.println(Arrays.equals(c1,ch2));

        System.out.println("============================");

        String sentence="I like to learn java"; // Split==> it helps us to split the variable and create an Array
        String [] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));// [I, like, to, learn, java]
        int totalwords=words.length;
        System.out.println(totalwords); //5

        System.out.println("=-==-=-=-=-=-=-=-=-=-=-=-");

        String result= "";
        for (int i= words.length-1; i>=0; i--) {

            System.out.print(words[i] + " ");

            result += words[i] + " ";
        }
        System.out.println("\n");
            System.out.println(result.trim());



        }





}
/* String Methods

toCharArry()==>  Returns Char Array
split

 */