package day08_ELSEif;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class elseIFPRACTICE {
    public static void main(String[] args) {
        double grade=100.1;

        if (grade>=90 && grade<=100) {
            System.out.println(" Your grade is A");}
        else if (grade>100) {
            System.out.println(" See your teacher for your grade");
        } else if(grade>=80 && grade <90){
                System.out.println("your grade is B");}
        else if (grade >=70 && grade<80){
         System.out.println( "Your grade is C");}
        else if(grade >=60 && grade<70){
                System.out.println("Your grade is D");  }
        else {
            System.out.println("Your grade is F");

        }

                }}

