package Day23_Method;

public class I_MorningTASK {
    //Unique Characters

    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};
        //       0    1    2
        for (int j = 0; j < arr.length; j++) { // 3:  A  B A
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[j].equals(arr[i])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(arr[j]);
            }
        }}}
       /* String[] a = {"A", "A", "B", "C", "C","D"};
        int x = 0;
        for (String each : a) {
            x = 0;
            for (int i = 0; i < a.length; i++) {
                if (each.equals(a[i])) {
                    x++;
                }
            }
            if (x == 1) {
                System.out.println(each);
            }}}}
        /*

  1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */