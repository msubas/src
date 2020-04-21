package Day20_ArrayMETHODS;

public class IV_ARRAYsize {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        //System.out.println(arr1[100]);
/*
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: 100
	at Day20_ArrayMETHODS.IV_ARRAYsize.
	main(IV_ARRAYsize.java:7)
 */

int []num=new int[2];

    num[0]=10;
    num[1]=20;
    num[2]=30;
/*
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: 2
	at Day20_ArrayMETHODS.IV_ARRAYsize.
	main(IV_ARRAYsize.java:19)
 */

    //num=new int[3];
    System.out.println(num[0]);

    }

}
