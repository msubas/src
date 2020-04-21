package Day14_String;

public class Stringmanupulationbooleans {
    public static void main(String[] args) {
        String str="";
        boolean a= str.isEmpty();
        System.out.println(a);

        String username="";
        if (username.isEmpty()){
            System.out.println("Please enter your username");

            String s1="Cat";
            String s2=new String("Cat");

            System.out.println(s1==s2);

            boolean b= s1.equals(s2);
            System.out.println(b);

            String z1="Tiger";
            String z2=new String("Tiger");
            String z3="Tiger";

            System.out.println(z1.equals(z2));

        }
    }
}
