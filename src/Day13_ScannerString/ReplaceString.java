package Day13_ScannerString;

public class ReplaceString {
    public static void main(String[] args) {
        String s2="I love C# Programing";
        String s3=s2.replace("C#", "Java");
        s2=s2.replace("C#", "Java");
        System.out.println(s3);
        System.out.println(s2);

        String name="Covid 18";
        name=name.replace("8", "9");
        System.out.println(name);
    }
}
