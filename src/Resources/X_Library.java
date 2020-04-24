package Resources;

import java.util.Arrays;

public class X_Library {

    public static void main(String[] args) {// First we have define 3 one dimensional Arrays
        int[] arr1 = {1, 10, 9, 8, 14, 15}; // max index # is 5

        int[] arr2 = {200, 100, 150, 500, 400}; // max index # is 4

        int[] arr3 = {1111, 5555, 3333, 4444}; // max index # is 3

        arr1 = sortDesending(arr1);   // in this step we re-initialized the arrays again
        arr2 = sortDesending(arr2);
        arr3 = sortDesending(arr3);

        System.out.println(Arrays.toString(arr1)); // in this line we print the numbers with descending order
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] sortDesending(int[] arr) { // We pay attention here because after int there 2 [].  First []
                                                    // indicates that this is an int method the second one is saying
                                                    // that this is an int Array

        Arrays.sort(arr);                          // With the Arrays.sort help we are going to order numbers from
        //                                                   // smaller to bigger

       int[] RevArr = new int[arr.length];          // In this step I need to initialize my revers Array. Therefore
                                                    // I am telling the system that the length of the new Array is going
                                                    // to be == original Array that I have


        int j = arr.length - 1;                   // This is indicating the max index number of the Array
        for (int i = 0; i < arr.length; i++) {    // i is indicating the RevArr's index number
            RevArr[i] = arr[j];                   // in this line we are saying that Take the orijinal Array's index J
            j--;                                  //  and assign to the index i of the ReverseArray
                                                  // After all those steps decrement j

            /*        i        j
               RevArr[0] = arr[3]
               RevArr[1] = arr[2]
               RevArr[2] = arr[1];
               RevArr[3] = arr[0]; */
        }
        return RevArr;
    }
    public static String RemoveDuplicates(String str) {
        String result = "";      //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //B
            if (!result.contains("" + ch)) {
                result += ch;
            }

        }

        return result;
    }
    public static int Frequency(String a, String b) {
        int count = 0;
        while (a.contains(b)) {
            count++;
            a = a.replaceFirst(b, "");// We want to make sure that we are not
            // counting the same index's character again and again.
            // Therefor we do remove the first one ofter we counted it
        }

        return count;
}
    public static String FrequencyOFChars(String str) {
        String nonDup = X_Library.RemoveDuplicates(str);
        // System.out.println(nonDup);
        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i);
            int num = X_Library.Frequency(str, ch);
           // System.out.print(ch + num);
            result += ch + num;

        }
        return result;}

    public static int minNumberArray(int[]arr) {
        int min=arr[0];
        for(int each: arr){
            if(each<min){
                min=each;}}
        System.out.println(min);
        return min;}}


