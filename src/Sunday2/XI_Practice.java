package Sunday2;

import java.util.Arrays;

public class XI_Practice {
// ***Below there are two different Samples***

    public static void main(String[] args) {
    //1
        int maxx= maxNumber(110,210,301);
        System.out.println(maxx);

        System.out.println("========================");
        System.out.println("========================");

      //2
        int []arr={10,20,30,40,20,21};
        int maxNum= maximum(arr);
        System.out.println(maxNum);
    }
//1
    public static int maxNumber(int a, int b, int c) {
        int[] numbers = {a, b, c}; // in this step - I said to my code to place the numbers that
                                    // I give you into an Array
        Arrays.sort(numbers); // if I have 3 numbers this code is going to order them smaller--->bigger
        return numbers[numbers.length-1]; // my command is here, return the last index number
                                            // from the sorted numbers Array
    }
//2
    public static int maximum(int []arr){ // In this sample I have an Array already.
        Arrays.sort(arr);                   // I sorted that array in this step and
        return arr[arr.length-1];           // I said return the maximum index number of the Array as maximum number

    }
}
