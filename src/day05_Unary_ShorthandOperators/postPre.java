package day05_Unary_ShorthandOperators;

public class postPre {
    public static void main(String[] args) {
        int a=100;
        System.out.println(++a);
        int b= 100;
        System.out.println(--b);
        System.out.println(b);


        int A=100;
        System.out.println(A++);
        System.out.println(A);

        int nm=50;
        System.out.println(--nm+ nm++ + nm-- + nm++);
        //49+49+50+49=197

        int m=4;
        int mm=m*4-m++;
        System.out.println(mm);
//16-4=12

        int u=1;
        u=-u--+u++/-u--*--u;
        //-1+0/-1* -1

        System.out.println(u);







    }


}
