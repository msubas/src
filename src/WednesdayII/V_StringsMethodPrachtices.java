package WednesdayII;

public class V_StringsMethodPrachtices {
    public static void main(String[] args) {

//replace vs replaceFirst

String str="I like C#, C# is cool";

str=str.replace("C#", "Java");
        System.out.println(str);
        // function change the whole C# with Java
        //I like Java, Java is cool

        String t1="Java is fun, Java is good";
        t1=t1.replaceFirst("Java", "C#");
        System.out.println(t1);
        //C# is fun, Java is good-Change the first Java



    }
}
