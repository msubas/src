package Day21_StringMethods_MultidimentionalARRAYS;

import java.util.Arrays;

public class XII_MultidementionalARRays {
    public static void main(String[] args) {

        int [] onedimentionalArray={1,2,3,4};
        int [][]twoDA={{1,2,3,4},{5,6,7,8}};
        //I have 2 index in this variable, and max index number
        // is 1.So, Length is 2.

        System.out.println(twoDA.length);
        int [] a= twoDA[0];
        int [] b= twoDA[1];
        System.out.println(Arrays.toString(a)+Arrays.toString(b));
    int num1= twoDA[1][3];
        System.out.println(num1);
    }
}
//n dimensional arrayMust contain (n-1) dimensinal Array