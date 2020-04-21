package Sunday2;

import java.util.Arrays;

public class VI_Practice {

    public static void main(String[] args) {

        int[][] Arr2D = {{1, 2, 3}, {4, 5}, {6}, {7}}; //I have a 2 Dimensional int Array.
        for (int[] each1DArray : Arr2D) { // in order to call each element from the 2DArray first I am calling
            for (int eachelement : each1DArray) { //each index number and then this step I am calling
                                                  //each index's elements
        System.out.print(eachelement + " "); }} // I print each element
        System.out.print("\n");
        System.out.print(Arr2D[3][0]); //with this code I just call the index number3's index 0
        System.out.print("\n");
        System.out.print(Arrays.deepToString(Arr2D));}}// this print method is to print the Array as 2D array


