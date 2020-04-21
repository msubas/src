package WednesdayII;

public class IV_StringsMethodsPractices {

    public static void main(String[] args) {

        String s = "I like Java";
        s = s.substring(7, 11);
        System.out.println(s);

        String n = "I like Java";
        String newword = n.substring(7, n.length());
        System.out.println(newword);

        String t = "I like Java";
        String newword2 = t.substring(2, 6);
        System.out.println(newword2);

        String sentence2 = "I like to learn Java";

        sentence2 = sentence2.substring(10);
        System.out.println(sentence2);
        //learn Java

        String r2 = "Java";
        String r3 = r2.substring(0, 2);
        String r4 = r2.substring(2, 3);
        r4 = r4.toUpperCase();
        String r5 = r2.substring(3, 4);
        System.out.println(r3 + r4 + r5);

        String r6 = r2.substring(2, 3).toUpperCase() + r2.substring(3);//Va
        System.out.println(r6);








// substring(begining and ending index): Creates substring
        // starting from begining till ending index
// substring (begining index)
    }
}
