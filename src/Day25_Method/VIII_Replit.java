package Day25_Method;

public class VIII_Replit {

    public static void main(String[] args) {
        boolean toBe = true;
        boolean notToBe = false;
        boolean x = hamletQuote(toBe, notToBe);
        System.out.println(x);
    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        if (toBe == true || notToBe == true) {
            return true;
        } else {
            return false;
        }

    }
}
