package Wednesday4;

public class II_MorningTASKS {

    public static void main(String[] args) {
        int[] numbers = {43, 36, 9, 73, 89};
        int max = Max(numbers);
        System.out.println(max);
    }

    public static int Max(int[] numbers) {
        int max = -2147483647;   // Such questions always we need something to compare therefor I do select the smallest
                                 // int number
        for (int i = 0; i < numbers.length; i++) { //our loop as usual
            int num = numbers[i];       //  I assigned my index i number to int num
            if (num > max) {            // Whit if statement's help we compare two numbers and assigned that
                                        // number to max if contition is not true number is not going to be
                max = num;              // assign to the max number
            }
        }
        return max;
    }
}

/*
warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
 */