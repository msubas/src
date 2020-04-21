package Day13_ScannerString;

public class StringandStringmanup {
    public static void main(String[] args) {
        String str="cat";
        String str2=new String("Cat");
        String str3="cat";
        System.out.println(str+":"+str2);
        System.out.println(str==str2);
        System.out.println(str=str3);
        String s1="Java";
        s1=" Javascript";
        System.out.println(s1);

        String s2="Java";
        System.out.println(s1==s2);

    }
}
/*
String Class
String str="What we initialize here is object"
there are 2 ways to crate object
1-String literal: String s=""
2- by using new key word
String  str2=new String("")

String is immutable
String s="Java" when this object created it will not change
s="JavaScript"; there will be a new object.
3- String represents the squence of chracters

String a="Cybertek"
//index : 01234567
String b= "cat dog"
           0123456

String manuplation

 */