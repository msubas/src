package Day29_Wrapper_ArrayList;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class XVII_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(91);
        numbers.add(21);
        numbers.add(83);
        numbers.add(41);
        numbers.add(500);

        int [] arr=new int[5];
        int [] fi=new int [5];
        int j=0;

        for (int i = numbers.size()-1; i >= 0; i--) {
            arr[i]=numbers.get(i);}
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            fi[j]=arr[i];
            j++;
        }

        System.out.println(Arrays.toString(fi));
    }

}




/*2. write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1
       X
 */