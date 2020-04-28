package Day29_Wrapper_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class XVI_Practice {
    public static void main(String[] args) {

        String input = "a1s2d3";
        //String input = "Today's date is 04/27/2020";
        String numbers="0123456789";
        int total = 0;

        for (int j = 0; j < numbers.length(); j++){
            for (int i = 0; i < input.length(); i++)
                if (input.charAt(i)==numbers.charAt(j)) {
                    total += j;
                }}
        System.out.println(total);}}










  /*
    WARMUP TASKS:
        1. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        HINT: on ascii table, the characters between #48 ~ #57 are digits

 */