package Day20_ArrayMETHODS;


import java.util.Arrays;

public class XI_ArraySort {
    public static void main(String[] args) {


    int[] arr={3,1,3,4,-100,-88,-155,155};
    Arrays.sort(arr);
        int[] arrDesc = new int[arr.length];
        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));


}}
