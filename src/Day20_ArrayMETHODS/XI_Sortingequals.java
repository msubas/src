package Day20_ArrayMETHODS;

import java.util.Arrays;

public class XI_Sortingequals {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int [] b={2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);

        boolean c=Arrays.equals(a,b);
        System.out.println(c);

    }
}
