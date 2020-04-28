package Day30_ArrayList;

import java.util.ArrayList;

public class III_Task {
    public static void main(String[] args) {



    ArrayList<Integer> numbers=new ArrayList<>();

    for(int i=1; i<6; i++){
        numbers.add(i);
    }
       System.out.println(numbers);

    for(int i= numbers.size()-1; i>=0; i--){


        System.out.print(numbers.get(i));

    }


    }}
