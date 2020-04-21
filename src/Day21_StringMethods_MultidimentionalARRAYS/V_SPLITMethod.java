package Day21_StringMethods_MultidimentionalARRAYS;

import java.util.Arrays;

public class V_SPLITMethod {
    public static void main(String[] args) {

        String str= "I like Java";
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        String sentence="Today is great day";

       String [] words=  sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i=words.length-1; i>=0; i--){

           String eachWords= words[i];
            System.out.print(eachWords+" ");

        }


    }
}
/*
split(value): returns char array from string

 */