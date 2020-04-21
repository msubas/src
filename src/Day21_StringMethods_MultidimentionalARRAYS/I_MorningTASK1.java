package Day21_StringMethods_MultidimentionalARRAYS;

public class I_MorningTASK1 {

    public static void main(String[] args) {

        int[] numbers={1,2,3,5,4,6};

        int lenght=numbers.length;
        int sum=0;

        for(int i=0; i<lenght; i++){

            int eachnumber=numbers[i];
            sum+=eachnumber;
        }

        System.out.println("Avarage of the number " +
                "is: "+sum/(double)lenght);
           //Here, we did explicit casting because
        // our original numbers were int

    }
}
