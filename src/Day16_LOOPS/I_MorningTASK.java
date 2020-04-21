package Day16_LOOPS;

public class I_MorningTASK {
    public static void main(String[] args) {


        for(int b=1; b<100;b+=2) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.print(b + ",");}}


                for (int a = 0; a < 100; a += 2) {
                    if (a % 3 == 0 && a % 5 == 0) {
                        System.out.print(a + ",");
                    }

                }System.out.println();
            }}

/*
1. write a program that can print all the ODD numbers
between 1 ~ 100 that can be divisible by 3 & 5
	2. write a program that can print all the EVEN numbers
	 between 1 ~ 100 that can be divisible by 3 & 5
	3. write a program that can calculate the sum
	of all the even numbers between 1 ~ 100
	4. write a program that can calculate
	the sum of all the odd numbers between 1 ~ 100;
	5. Write a program that will print
	out all letters in English alphabet
	 in ascending order
	6. Write a program that will print
	out all letters in English alphabet in
	 descedning order
	7. write a program that can calculate the
	sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */