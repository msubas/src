package Day25_Method;

public class VIII_Practice {

    public static void main(String[] args) {
        String a="Python Python";
        String b="Python";

        int x=Frequency(a,b);
        System.out.println(x);

        String str1 = "AAA";
        String str2 = "A";

        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");// We want to make sure that we are not
            // counting the same index's character again and again.
            // Therefor we do remove the first one ofter we counted it
        }
        System.out.println(str1);
        System.out.println(count);
    }

    public static int Frequency(String a, String b) {
        int count = 0;
        while (a.contains(b)) {
            count++;
            a = a.replaceFirst(b, "");// We want to make sure that we are not
            // counting the same index's character again and again.
            // Therefor we do remove the first one ofter we counted it
        }

       return count;


    }
}