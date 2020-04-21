package Day18_NestedLOOP;

public class IV_DoWhile2 {
    public static void main(String[] args) {

        int number = 10;
        while (number >= 100) {
            System.out.println(number);
            number--;
        }
        System.out.println("=================================");
       do{
           System.out.println(number);
           number--;
       }
        while(number>=100);
    }}

    /*
    Since condition is fdalse for the first statement
    it will not run the code. However second code is a
    do-while loop event the condition is false. It will run the
code at least one.

     */