package Day14_String;

public class containsString {

    public static void main(String[] args) {

        String a="CYBERTEK";
        String b= "cybertek";

        System.out.println( a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String s1="Cybertek School";
        boolean r1= s1.contains("School");
        System.out.println(r1);

    }
}
/*
contains(str)
 */