package day05_Unary_ShorthandOperators;

public class primitiveCasting {

    public static void main(String[] args) {
    /*
    double>float>long>int>short>byte
    primitive casting

    Primitive Casting
    implicit casting: casting smaller primitives to larger

    int a=10;
    long b=a====>10L it is done automaticly by compiler we are not adding L

    manually
    int a=10;
    long b= (long)a; ====> b=10L
    int c=b ===> it is going to give compile error because b is long now
    so we cannot assign smaller group which is int

       Explicit Casting: large primitives to smallar primitive type

    int a=100;
    byte b=a; ====> byte b=(byte)a either we should assign smaller or same datatype



     */
    int num1 = 100;
        byte num2 = (byte) num1;

        double dnum=5.5;
        float fnum= (float)dnum;
        double d1=10.5;
        long L1=(long)d1;
        float f2=60.5f;
        int i2=(short)f2;
        int I3=(int)f2;
        long largenum=99999999999L;
        int intNum= (int)largenum;
        char c1='a';
        short sh1= (short)c1;
        char ch2= 23456;
        double d5= ch2;
        int z1=10;
        double do1=z1;
        short zz1=(short)z1;

        System.out.println(num2);
        System.out.println(fnum);
        System.out.println(L1);
        System.out.println(f2);
        System.out.println(I3);
        System.out.println(intNum);
        System.out.println(sh1);
        System.out.println(d5);
        System.out.println(do1);
        System.out.println(zz1);


    }
}