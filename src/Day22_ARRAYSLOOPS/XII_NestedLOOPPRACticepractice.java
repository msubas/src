package Day22_ARRAYSLOOPS;

import java.util.Arrays;

public class XII_NestedLOOPPRACticepractice {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};

int countOdd=0;

        for (int j = 0; j < numbers.length; j++) {

            for (int i = 0; i < numbers[j].length; i++) {

                int num = numbers[j][i];
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
                else{
                    countOdd++;
                }
                            }
            /*
            public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};


        for (int j = 0; j < numbers.length; j++) {//j is the index number of 1D Array
            for (int i = numbers[j].length-1; i>=0 ;i--) {//i represent the elements of the selected index's elements

            System.out.print(numbers[j][i] + " ");}
             */

        }
    }
}