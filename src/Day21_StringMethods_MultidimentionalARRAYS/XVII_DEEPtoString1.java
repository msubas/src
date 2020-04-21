package Day21_StringMethods_MultidimentionalARRAYS;

import java.util.Arrays;

public class XVII_DEEPtoString1 {

    public static void main(String[] args) {

        int [] arr1D={1,2,3};

        System.out.println(Arrays.toString(arr1D));
        //this method is only for 1D Arrays
        //We cannot print multiD Arrays with it
        System.out.println("=========================");
int [][] arr2D= {{1,2,3},{4,5,6}};
// in order to print this one we can use

        System.out.println(Arrays.deepToString(arr2D));





    }
}
