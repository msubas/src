package Day14_String;

public class StringManup {
    public static void main(String[] args) {
        System.out.println();
        String str= "I like to learn Java. I like to watch the movie Jumanji";
        int a1=str.indexOf("Jum");
        System.out.println(a1);

        String s="I like Java, and I like reading";
        int b= s.lastIndexOf("I");
        System.out.println(b);
  int b2= s.lastIndexOf("l");
        System.out.println(b2);
        String z="I like C#, C# is cool";
        int c1=z.indexOf("C");
        int m1=z.lastIndexOf("C");
        System.out.println(c1);
        System.out.println(m1);
        String x="I like Java, Java is fun, Java programming is fun";
        int d1=x.indexOf("Java is");
        System.out.println(d1);
        char ch1=x.charAt(13);
        System.out.println(ch1);

    }
}
/*
indexOf(value);indes namber of value
lastIndexOf(value)

 */