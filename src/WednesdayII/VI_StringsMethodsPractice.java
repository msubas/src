package WednesdayII;

public class VI_StringsMethodsPractice {
    public static void main(String[] args) {

        String y1= "Today is Wednesday";
        int W1=y1.indexOf("y");
        System.out.println(W1);

        //IndexOf : Index of the first matching
        // character as in int. For ex: first y
        // is at the index number 4

        int lastE=y1.lastIndexOf("e");
        System.out.println(lastE);
        //lastIndexOf: Index of the last matching
        //         character as in int
        //For ex: last  e
        // is at the index number 13

    }
}
