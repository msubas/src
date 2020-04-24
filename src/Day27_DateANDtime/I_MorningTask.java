package Day27_DateANDtime;

public class I_MorningTask {
    public static void main(String[] args) {
        int[] Arr = {1, 3, 5, 7};
        min(Arr);
        double[]Arrs={0.01, 0.03,0.005, 0.07};
            min(Arrs);}

    public static int min(int[] arr) {
        int minnum = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minnum) {
                minnum = arr[i]; } }
        System.out.println(minnum);
        return minnum; }

    public static double min(double[] arr2) {
        double minnum2 = 2147483647;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < minnum2) {
                minnum2 = arr2[i]; } }
        System.out.println(minnum2);
        return minnum2;}}

/*
 1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.
        3. write a method that can print out the unique elements from an int array
                    Ex: {1,1,2,3,3} ==> 2
                        {6,6,7,7,8,9} ==> 8 9
        4. write a method that can print out the unique elements from a double array
                    Note: Apply method overloading

 */