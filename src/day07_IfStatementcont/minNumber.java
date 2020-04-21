package day07_IfStatementcont;

public class minNumber {

    public static void main(String[] args) {
        double a=1000000;
        double b=200;
        double c=300;
        boolean amin=a<b && a<c;
        boolean bmin= b<a && b<c;
        boolean cmin= c<a && c<b;
        if(amin){
            System.out.println(a+ " is the min number" );
        }
        if (bmin) {
            System.out.println(b + " is the min number");}
        if (cmin) {
            System.out.println(c + " is the min number");
    }}}
