package Day23_Method;

import java.util.Scanner;

public class XVIII_Replit {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++)
        {arr[i] = inp.nextInt();
            if (arr[i] != 0) {
                if (arr[i] > 0) {
                    positive += 1;}
                if (arr[i] < 0) {
                    negative += 1;}}
            else {
                zero += 1;
            }}
        System.out.println(positive+" positive number, "+ negative+" negative number, "+ zero+ " zero");
    }}

// plus_minus(arr);



/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1

 */