package Day30_ArrayList;

public class II_Task2 {
    public static void main(String[] args) {


            String str = "Today's date is 04/27/2020";
            char[] chars = str.toCharArray();
            int sum = 0;


            for (char each : chars) {
                if (Character.isDigit(each)) {
                    sum += Integer.parseInt("" + each);
                }
            }
            System.out.println(sum);
        }
    }

    /*

    boolean a= Character.isAlphabetic('A')
     */