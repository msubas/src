package Day21_StringMethods_MultidimentionalARRAYS;

public class VII_ForEachLOOP {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4};

        for (int eachelement : nums) {
            System.out.print(eachelement + " ");


            String[] students = {"Mazhar", "Fuat", "Ozkan"};

            for (String eachStudent:students){
                System.out.print(eachStudent);
            }

        }

    }
}
/*

for(DataType variableName:ArrayName){}
variable name represents each of the daya in the array



 */