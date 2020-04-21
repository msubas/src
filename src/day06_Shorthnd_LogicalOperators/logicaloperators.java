package day06_Shorthnd_LogicalOperators;
public class logicaloperators {
    public static void main(String[] args) {
        /*
       && "and" logic   only time it is true both conditions are true
       || "or" logic as long as one condition is true
            it will be always true
       ! opposite logic

       they are applicable for boolean experations
         */
       /*logical opposite operators
        !true==false
        !false==true
        */
boolean result1= true;
        System.out.println(!result1);

        boolean result2= 10+15>15;
        System.out.println(result2);

        boolean result8= !(10+15>15);
        System.out.println(result8);

        boolean result3= !true== !false;
        System.out.println(result3);

//==========================================================


        boolean i= 5==5 && 3>2;
        System.out.println(i);

        boolean R1="corona virus" !="end of the world"
                && "toilet paper"=="cure";
        System.out.println(R1);

        boolean B2= 100>15 && 15<30;
        System.out.println(B2);

        boolean R3= 'a'=='b'-1 && 'b'+1=='c';
        System.out.println(R3);

        boolean g= 9>10 || 10>9;

        System.out.println(g);


        boolean Y= !false; // True





















    }
}
