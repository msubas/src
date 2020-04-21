package Day13_ScannerString;

public class StringManupulation {
    public static void main(String[] args) {
        String s="Cybertek";

    char a=  s.charAt(5);
        System.out.println(a);

        int b= s.length();
        System.out.println(b);
        System.out.println(b>250);

        String str2=" Today is a great day. Java is fun.";
        int c=str2.length();
        System.out.println(c);

        String s2="Cybertek";
        s2.concat(" School");

        System.out.println(s2);

        String string2="java";
        System.out.println(string2.concat("is a programing language"));
        System.out.println(string2);

        String name1="CYBERTEK";
        name1=name1.toLowerCase();
        System.out.println(name1);

        String name2="cybertek";
        name2=name2.toUpperCase();
        System.out.println(name2);

        String ab="      Today is a great day! ";
        ab=ab.trim();
        System.out.println(ab);







    }
}

/*
charAt(IndexNumber); it returns the char
lenght()
 Concat(Value):
 Trim()= removing the unused spaces.
 */