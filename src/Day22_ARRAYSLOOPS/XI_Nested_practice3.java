package Day22_ARRAYSLOOPS;

public class XI_Nested_practice3 {

    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};


        for (int j = 0; j < numbers.length; j++) {//j is the index number of 1D Array
            for (int i = numbers[j].length-1; i>=0 ;i--) {//i represent the elements of the selected index's elements

            System.out.print(numbers[j][i] + " ");}
            //System.out.println();//this is going to make the
            // numbers separately printed
        }
        System.out.println();

        for(int k=numbers.length-1; k>=0; k--){

            for(int i=0; i<numbers[k].length;i++){
                System.out.print(numbers[k][i]+ " ");
            }
        }
    }
}