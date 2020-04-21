package Day21_StringMethods_MultidimentionalARRAYS;


import java.util.Arrays;

public class XVIII_3Darraays {

    public static void main(String[] args) {

        int [] arr={1,2,3};
        int [][]arr2D= {{1,2,3},{1,2,3}};
        int [][][] arr3D={{{1,2,3},{11,22,33}},{{4,5,6},{77,88,99}}};

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println( arr3D[1][1][2]);
    }
}
