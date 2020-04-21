package Day18_NestedLOOP;

public class iX_practice {

    public static void main(String[] args) {

        int i=1;
        do{
            System.out.println(i);
            i+=2;
        }
        while (i<=100);
       System.out.println("==================");
        int m=1;
        do {
            if (m % 2 == 1) {
                m++;
                continue;
            }

            System.out.print(" "+m);
            m++;
        }while(m<100);





    }
}
