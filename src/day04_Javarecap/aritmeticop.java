package day04_Javarecap;

public class aritmeticop {
    public static void main(String[] args) {
        int a=10/3;
        double b=10/4;
        float c=10;
        double d=4;

        boolean evennumber=25%2==0;
        boolean oddnumber=22%2==1;
        boolean oddnumber2=22%2 !=0;


        System.out.println(a);
        System.out.println(10/4);
        System.out.println(b);
        System.out.println(c/d);
        System.out.println(10/3.0);
        System.out.println(10.0/4.0);
        System.out.println(10%4);
        System.out.println(evennumber);
        System.out.println(oddnumber);
        System.out.println(oddnumber2);
        System.out.println(10%2==0);

        System.out.println("10 is even number"+(10%2==0));
        System.out.println("11 is even number"+ (11%2==0));
        System.out.println("25 is a odd number"+ (25%2==1));
        System.out.println("25 is even number" +(25%2 !=1));
    }
}
