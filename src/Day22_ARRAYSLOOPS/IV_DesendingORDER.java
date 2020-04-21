package Day22_ARRAYSLOOPS;

import java.util.Arrays;

public class IV_DesendingORDER {
    public static void main(String[] args) {

        int [] arr= {123,534,345,75,1234,564234,3,-1231};
      //  Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        int [] RevArr= new int[arr.length];

        int j=arr.length-1;
        for (int i=0 ; i<arr.length; i++){
            RevArr[i]=arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));

    }
}
