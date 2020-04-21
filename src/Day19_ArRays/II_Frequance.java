package Day19_ArRays;

import com.sun.org.apache.xpath.internal.functions.FuncDoclocation;

public class II_Frequance {
    public static void main(String[] args) {


        String str="AABCBCAD";// A3B2C1
        String result="" ;
        String nonDup= "";

        int ChIndex=str.length()-1;


        for(int i=0; i<=ChIndex; i++){

            if(!nonDup.contains(""+str.charAt(i))){

                nonDup+=str.charAt(i);

            }
        }
        System.out.println(nonDup);
        int count=0;

    }



}


