package Day29_Wrapper_ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.ArrayList;

public class XV_Practice {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(5);

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");

        int m = numbers.get(0).length();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).length() > m) {
                m = numbers.get(i).length();
            } }

        for(int n=0; n<m; n++){
     if(numbers.get(n).length()>=m){
         System.out.println(numbers.get(n));
         System.out.println(m); }}}}
