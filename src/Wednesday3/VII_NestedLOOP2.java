package Wednesday3;

public class VII_NestedLOOP2 {

    public static void main(String[] args) {
        int[][] numbers = {
                {5, 4, 3, 2, 1},
                {10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};

        for (int j = 0; j < numbers.length; j++) { //Indexes
            for (int i = 0; i < numbers[j].length; i++) { //Elements of the indexes
                if (numbers[j][i]% 2 == 1) {
                   }
                 else {
                    continue;
                }
                System.out.print( numbers[j][i]+" ");
            }

        }
        System.out.println("\n"+"==================");

        for (int[] each1DArray: numbers){
            for( int eachelement:each1DArray){
                if(eachelement%2==1){
                    continue;
                }

                System.out.println(eachelement);
            }


        }



    }

}
