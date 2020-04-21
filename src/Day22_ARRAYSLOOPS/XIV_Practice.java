package Day22_ARRAYSLOOPS;

public class XIV_Practice {

    public static void main(String[] args) {


        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20, 21}};

        int countodd = 0;
        int sumodd = 0;
        int sumofEven = 0;


        for ( int[] eac1DArray : numbers) {
            for (int eachElement :eac1DArray) {
                if (eachElement % 2 == 0) {
                    sumofEven += eachElement;
                    System.out.print(eachElement + " ");
                } else {
                    sumodd += eachElement;
                    countodd++;
                }
            }

        }
        System.out.println("\n"+"===================");
     System.out.println("Total number of odd numbers: "+countodd);
            System.out.println("Sum of the odd numbers: "+sumodd);
            System.out.println("Sum of the even numbers: " +sumofEven);
}}

