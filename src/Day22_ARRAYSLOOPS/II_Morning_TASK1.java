package Day22_ARRAYSLOOPS;

import java.util.Arrays;

public class II_Morning_TASK1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            int eachNum = arr[i];
            System.out.println(eachNum);
           }
// second way to solve the question

        int[] RevArr = new int[arr.length];

        int j=arr.length-1;
        for (int i=0; i<arr.length; i++){
            RevArr[i]=arr[j];
            j--;
    }

        System.out.println(Arrays.toString(RevArr));
}
        }





//Reverse Array