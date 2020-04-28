package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class XI_ArrayLIST {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(5); //ArrayList <DATATYPE> VARIABLE=new ArrayList<>(Capacity);
        // int [] arr= new int[3] but we dont need to initialize
        // the size

        ArrayList<Integer> scores = new ArrayList<>(); // Capacity is 0 and automaticly changes based on the adds and removes

        // add() method===> add elements to to the ArrayList

        scores.add(10);//Autoboxing===> size of the arraylist is 1--->[10]
        scores.add(20);// now size became 2 [10, 20]
        scores.add(123);//now size became 3----> [10, 20, 123]
        System.out.println(scores);


        Integer a1=scores.get(2);// index 2 == 123
        int a2=scores.get(2);
        System.out.println(a2);// 123
        System.out.println(a1);// 123
        int t=scores.size(); // This is the length of the array
        System.out.println(t);//3

    }}
