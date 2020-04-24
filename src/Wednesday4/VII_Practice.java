package Wednesday4;

import java.util.Arrays;

public class VII_Practice {
    public static void main(String[] args) {
        int [] arr= {21,32,43,54,56,67};

        secondmaxnumber(arr);}

 public static int secondmaxnumber(int[] arr) {

     Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
int lastindex=arr.length-1;
int secondlast=lastindex-1;
     System.out.println(arr[secondlast]);

     return secondlast;
 }

}
