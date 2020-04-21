package day06_Shorthnd_LogicalOperators;

public class shorthandoperators {

    public static void main(String[] args) {
        /*
        += addition
        -= subtraction
        *= multiplication
        /= division

         */

        int x=20;
        x+=300;
                System.out.println(x);

                int A= 100;
                        A-=90;
        System.out.println(A);

        int B= 200;
                B-=A;
        System.out.println(B);
int m= 5;
        m*=3;
        System.out.println(m);
int n=m*=10;
        System.out.println(n);
        System.out.println(m);

        int c=100;
        int z= (c*=2)+ ++c;

        System.out.println(c);
        System.out.println(z);

        int x1=10;
        int y= x1+=10*2;
        System.out.println(x1);
        System.out.println(y);

        int num1=300;
        num1/=2;
        System.out.println(num1);

        int num2=400;
        num2/=20+10;
        System.out.println(num2);

        int q=100;
        q%=10;
        System.out.println(q);


        int num3=300;
        num3%=10+20;
        System.out.println(num3);


int n1=400;
n1%=3*5;
        System.out.println(n1);


    }
}
