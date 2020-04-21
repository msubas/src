package Day22_ARRAYSLOOPS;

import java.util.Arrays;

public class VII_Multi_Darrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        //Index 0 1 2

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        //Index   0        1

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        //Index             0                1

        int[] arr1d = arr2D[0];
        System.out.println(Arrays.toString(arr1d));
        // System.out.println(Arrays.toString(arr2D[0]));
        // this is same with the above print statement

        // if I want to get the 3 from the arr2D
        System.out.println(arr2D[0][2]);

        //If I want to print the arr2D I need to use
        //deppToString method
        System.out.println(Arrays.deepToString(arr2D));

        //If I want to print the arr3D I need to use
        //deepToString method again
        System.out.println(Arrays.deepToString(arr3D));
//============================================================
        for (int each : arr2D[0]) {
            System.out.println(each);
        }
        //it is going to print the each element in the
        //index of the arr2D

        //this is the otherway of the same result
        for (int i = 0; i < arr2D[0].length; i++){
            int num=arr2D[0][i];
            System.out.println(num);

        }


        }
    }
