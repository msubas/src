package Wednesday4;

public class VI_Practice {
    public static void main(String[] args) {
        reverse("ABBA");
    }

    public static String reverse(String a) {

        int index = a.length() - 1;
        String reverse = "";

        for (int i =index; i >= 0; i--) {
            reverse += a.charAt(i);}
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(a)){
            System.out.println("Palindrome of  "+ a );
        }
        else
        {
            System.out.println("Not palindrome");}

        return reverse;}}



