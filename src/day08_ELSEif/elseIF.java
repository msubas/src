package day08_ELSEif;

public class elseIF {
    public static void main(String[] args) {


    /*
    else if means technically otherwise

     */
int a=-1;

boolean zero= a==0;
boolean negative= a<0;
boolean positive= a>0;

if (zero){
    System.out.println(" number is zero");}
else if(negative){
    System.out.println(a + " is a negative number"
    );}
else {
    System.out.println(" positive");}

    }
}
