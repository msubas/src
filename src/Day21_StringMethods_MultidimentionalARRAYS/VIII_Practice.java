package Day21_StringMethods_MultidimentionalARRAYS;

public class VIII_Practice {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        //do not print the numbers less than 5

        for(int eachnumbers:arr1){
            if (eachnumbers>5){
                System.out.println(eachnumbers);
            }
        }

    }
}
