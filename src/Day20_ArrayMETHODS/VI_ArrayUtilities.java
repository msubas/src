package Day20_ArrayMETHODS;
import java.util.Arrays;
public class VI_ArrayUtilities {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = new int[arr1.length+arr2.length];
        int add=0;

        for (int i = 0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
            add++;}

        for (int m = 0; m <arr2.length; m++) {
             arr3[add] = arr2[m];
        add++;}

        for(int i = 0; i < arr3.length;i++) {
            System.out.print(arr3[i]+" ");

        }}}

/*
arr 1=[1,2,3]
arr2=[4,5,6,7]
 */