package Day23_Method;

import java.util.Arrays;
import java.util.Scanner;

public class X_Practive {


    public static void main(String[] args) {
        max_number();
        min_number();
        numberswithDescendingOrder();
    }

    public static void max_number() {

        int[] numbers = {1, 2, 3, 35, 5, 6, 7, 8, 9};

        int max = numbers[0];
        for (int a = 0; a <= numbers.length - 1; a++) {
            if (numbers[a] > max)
                max = numbers[a];

        }


        System.out.println(max);
    }

    public static void min_number() {

        int[] numbers = {1, 2, 3, 35, 5, 6, 7, 8, 9};


        int min = numbers[numbers.length - 1];
        for (int m = numbers.length - 1; m > 0; m--) {
            if (numbers[m] < min) ;
            min = numbers[m];
        }
        System.out.println(min);
    }

    public static void numberswithDescendingOrder() {

        int[] numbers = {1, 2, 3, 35, 5, 6, 7, 8, 9};

        Arrays.sort(numbers);

        int[] DescendingOrder = new int[numbers.length];
        int j = 0;
        for(int i = numbers.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            DescendingOrder[j]  = numbers[i];
            j++;
        }

        System.out.println(Arrays.toString(DescendingOrder));
    } }






/*

create a function that can print out max number from the any
given Array
and
min number
and
order numbers descending order
[1,2,3]===> [3,2,1]


 */