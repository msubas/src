package Day21_StringMethods_MultidimentionalARRAYS;

import java.text.DecimalFormat;

public class II_TASK2 {

    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");
        double a=10.0/3.0;
        System.out.println(DF.format(a));
        //Result will be 3.33
    }
}
