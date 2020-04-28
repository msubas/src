package Day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class XVIII_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(7);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        System.out.println(arr);

        ArrayList<Integer> arrfi = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arrfi.contains(arr.get(i))) {
                arrfi.add(arr.get(i));
                ;}}
        System.out.println(arrfi); }}



/*

        3. write a program that can print out the unique elements from an int array
        HINT: store all the unqie elemenbts of array into a list of integers
        Ex: array==> {1,1,2,3,3,4,5}
        output: {2,4,5}
        4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
        ex: list==> {1,1,2,3,3,4,5}
        uniques ==> {2,4,5}
        5. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}


 */