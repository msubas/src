package Day14_String;

public class Endwithstringss {
    public static void main(String[] args) {
        String s4= "Cybertek School";
        System.out.println(s4.endsWith("l"));

        String email="CybertekSchool@yahoo.com";

        if (email.endsWith("gmail.com")) {
            System.out.println("You did not use a gmail address");
        }


    }
}
