package Day13_ScannerString;

public class ReplaceFirst {
    public static void main(String[] args) {
        String r1="I like C# is fun,C# is cool";
        r1=r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2= "Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);
    }
}
