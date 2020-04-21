package day05_Unary_ShorthandOperators;

public class unaryoperators {
    public static void main(String[] args) {
        int a=10; //positive number
        int b=+a; //positive number
        int a2=-2;
        int a3= 20;
        int y2=-a3;
        boolean result= a2>0;

        int t1=100;
        int p1=10;
        int d1=5;


        System.out.println(a+"\nb");
        System.out.println(result);
        System.out.println(y2);
        System.out.println(++t1);
        System.out.println(t1);
        System.out.println(p1++);
        System.out.println(--d1);

    }
    /*
    +num===>positive number
    -num===> negative number
    -- decrement===== --number ==> predecrement
                        number-- ==> postdecrement
    ++ increment ===== ++number==> preincrement
                ====== number++ ===> postincrement


     */
}
