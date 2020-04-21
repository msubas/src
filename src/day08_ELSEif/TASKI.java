package day08_ELSEif;

public class TASKI {
    public static void main(String[] args) {


    /*
    1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal

     */
    int a=1,b=1,c=0;
    if (a==b && (a!=c&& b!=c)){
        System.out.println(" a equal to b");}
        if (a==c && (a!=b&& b!=a)){
            System.out.println(" a equal to c");}
            if (c==b && (a!=c&& a!=c)){
                System.out.println(" b equal to c");}
            if (a==b && b==c){
                System.out.println(" a equal to b and c");}
            if ((a!=b && b!=c)&& a!=c) {
                System.out.println("Numbers are not equal to each other");



    }}
}