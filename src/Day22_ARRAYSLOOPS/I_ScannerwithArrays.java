package Day22_ARRAYSLOOPS;

import java.util.Arrays;
import java.util.Scanner;

public class I_ScannerwithArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }
        System.out.println(Arrays.toString(arr));

        for( String everelement:arr){
            System.out.println(everelement.substring(0,3));
        }

    }
}
/*

We are going to use Scanner for each substring and Arrays
 */