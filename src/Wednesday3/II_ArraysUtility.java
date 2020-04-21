package Wednesday3;

import java.util.Arrays;

public class II_ArraysUtility {
    public static void main(String[] args) {


        // Array Utilities : import java.util.Arrays;

        int [] arr={9,10,8,65,8,6,5};

        Arrays.sort(arr); // Arrays.sort() helps us to sort the given data smaller to bigger or a-z
        System.out.println(Arrays.toString(arr)); // in order to print that array we are going use the
                                                    // Arrays.toString() method
        System.out.println("=========================");

        int [] salaries={10000,20000,30, 5000,432,123123,200000}; // in this sample we are going to find the
        int salariesL=salaries.length;
        int salariesIndex= salariesL-1;
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("min salary is: "+ salaries[0]);
        System.out.println("=========================");

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println("=========================");

        int[] arr3={1,2,3};
        int[] arr4={2,3,1};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println("============================");

        String [] a={"Name1","Name2","Name3"};
        String [] b={"Name3", "Name1", "Name2"};

        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        // System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a,b)); //True



    }
}
//ARRAY Methods
// we do get the import java.util.Arrays;
// Arrays.sort()
// Arrays.equal()
//Arrays.toString()
//Arrays.deepTOString
