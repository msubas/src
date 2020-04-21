package Day23_Method;

import java.util.Scanner;

public class VII_Declerating_Methods_withParameter {





        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter your age");
            byte age = scan.nextByte();

            EligibleToBuyAlcohol(age); // explicit casting

        }


        public static void EligibleToBuyAlcohol(byte age){

            if(age >= 21){
                System.out.println("Eligible to by alcohol");
            }else{
                System.out.println("Eligible to buy milk");
            }

        }


    }
/*

Declaring a Method (With Parameter)

AccessModifiers Specifiers ReturnTypeMethod Name(Parameter)

1-AccessModifiers types: Public,protected,default,private
2-Specifiers: Static, final, abstract,synchronized
3-Return-type: void,any data type


 */