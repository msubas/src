package ZPracticeSamples;

public class ARRAYS_UniqueCharacter {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5}; // This is our given Array

        for (int m = 0; m < numbers.length; m++) {
            int count = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[m]) {
                    count++;
                }
            }
            if (count == 1) {
              System.out.print(numbers[m]+" ");
            }
        }
    }
}