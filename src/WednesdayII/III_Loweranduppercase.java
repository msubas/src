package WednesdayII;

public class III_Loweranduppercase {

    public static void main(String[] args) {

        String str="   Java   ";
        str=str.toLowerCase();
        System.out.println(str);
                //java

        str=str.toUpperCase();
        System.out.println(str);
                //JAVA

        str=str.trim();
        System.out.println(str);
                // it removed the spaces before
        // and after the Sentence. So it became "JAVA"

String s= "            ";
s=s.trim();
        System.out.println(s.length());
        // result is zero
    }
}
