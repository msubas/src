package Day22_ARRAYSLOOPS;

public class X_NestedArrayLoopPractice2 {

    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1}};


        for (int j = 0; j < numbers.length; j++) {//j is the index number of 1D Array
            for (int i = 0; i < numbers[j].length; i++) {//i represent the elements of the selected index's elements
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();//this is going to make the
            // numbers separately printed
        }
    }
}
