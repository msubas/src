package WednesdayII;

public class VII_StringMethodsPractices {
    public static void main(String[] args) {
        String str1="  ";
       boolean r1= str1.isEmpty();
        System.out.println(r1);

        boolean r2=!str1.isEmpty();
        System.out.println(r2);

        String s1="cat";
        String s3="Cat";

        System.out.println(s1.equals(s3));

        System.out.println(s3.equalsIgnoreCase(s1));

        String t1="";
        System.out.println(t1.isEmpty());
        // Since there is no character at the
        // t1 statement is true

        String sentence="I like to learn Java";
        System.out.println(sentence.contains("Java"));

        String m="Top 3 viruses are: 1-Corona, 2-Hanta, 3.Ebola";
        System.out.println(m.contains("Corona"));






    }
}
