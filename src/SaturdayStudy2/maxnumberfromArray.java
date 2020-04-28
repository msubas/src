import java.util.Arrays;

public class SaturdayStudy2 {
    public static void main(String[] args) {

        int [] numbers={1,2,3,44,5,6,7,8,9};
        int max=numbers[0];

        for (int i =0; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
}
