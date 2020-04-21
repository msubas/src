package Day20_ArrayMETHODS;

public class I_MorningTASK1 {
    public static void main(String[] args) {


        int [] numbers={1,2,3,44,5,6,7,8,9};
        int max=numbers[0];
        for(int a=0; a<=numbers.length-1; a++){
            if(numbers[a]>max)
                max=numbers[a];

        }
        System.out.println(max);
    }
}
/*

 1. write a program that can find the maximum number
 from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE
                HAVN'T COVERED IN THE CLASS

 */