package Day20_ArrayMETHODS;

import java.util.Arrays;

public class XVI_Practice {
    public static void main(String[] args) {

        String a="Cybertek School";
        String b= "School Cybertek";

        char [] ch1=a.toCharArray();
        char [] ch2=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equalsSTR=Arrays.equals(ch1,ch2);
        System.out.println(equalsSTR);
    }
}
