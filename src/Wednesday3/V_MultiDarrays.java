package Wednesday3;

import java.util.Arrays;

public class V_MultiDarrays {
    public static void main(String[] args) {
        int [] arr1D={1,2,3};
        int [][] arr2D={{1,2,3},{4,5,6,7}};

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][3]);//will be = 7
        System.out.println(Arrays.deepToString(arr2D));

    }
}