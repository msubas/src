package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class XIV_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>(5);

        numbers.add(10);
        numbers.add(120);
        numbers.add(300);
        numbers.add(150);
        numbers.add(5);

        Integer a=Integer.MIN_VALUE;
        //int a=numbers.get(0); either we can use the min value or we can assign the index 0

        for(int each:numbers){
            if(each>a){
              a=each;

            }}

        System.out.println(a);}
}
