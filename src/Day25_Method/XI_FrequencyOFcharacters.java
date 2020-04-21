package Day25_Method;

import Resources.X_Library;

public class XI_FrequencyOFcharacters {

    public static void main(String[] args) {

        String str = "AABCBCAD";// A3B2C2D1
        String nonDup = X_Library.RemoveDuplicates(str);
        // System.out.println(nonDup);
        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i);
            int num = X_Library.Frequency(str, ch);
            System.out.print(ch + num);
            result += ch + num;

        }


    }

    public static String FrequencyOFChars(String str) {
        String nonDup = X_Library.RemoveDuplicates(str);
        // System.out.println(nonDup);
        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i);
            int num = X_Library.Frequency(str, ch);
            System.out.print(ch + num);
            result += ch + num;

        }
        return result;
    }
}


