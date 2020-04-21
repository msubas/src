package Saturday_Study;

public class XX_REplit {


    public static void main(String[] args) {

        add(10, 20);// First I decelerated my method as void method.
        // this was my void method public static void add(int a,int b), and I wont be able to use the result for further
        // operations again. However, if I am going to use int instead of void method I can use the data.
        //  public static int add(int a,int b)

        // System is going to print the below addition operation and that's it
        // if I want to use the daya again I need to use "return"
        // I will change method from public static void add(int a,int b)
        //                      to public static int add(int a,int b) so system knows that result is going to be int
        // so I can use that int again. Because it is now technically decelerated as another int

        int result=add(10,20);// Since first I decelerated my method as void method.
        // public static void add(int a,int b),  I wont be able to use the result for further operations again.
        // However, if I am going to use int instead of void method I can use the data again and again.

        int y= result+3;  // Since we used int method and return function so we can use the result again and again
        System.out.println(y);
    }

    public static int add(int a, int b) {//public static VOID add(int a,int b) to public static INT add(int a,int b)
        System.out.println(a + b); // System is going to print this
        return a+b; // it will keep the data here and if I want to use again I can use it FOR EX look int y at the
                    // main method

    }

}
