package Day29_Wrapper_ArrayList;

public class V_valueOF {

    public static void main(String[] args) {

        String str="123";
        Integer a=123;


        Integer m=Integer.valueOf(str);
        System.out.println(m); // It is int value

        String str2="15.5";
        double d1=Double.parseDouble(str2);
        System.out.println(d1); // this is primitive data this is neither auto or unboxing because we assign
                                // primitive to primitive 15.5

        double d2=Double.valueOf(str2);// This is unboxing
        System.out.println(d2); //15.5

        System.out.println(d1==d2);//



    }
}
