package Day29_Wrapper_ArrayList;

public class III_parseMethod {

    public static void main(String[] args) {

        String a="123"; // " 123abc" assign something like that !!!
        int c=Integer.parseInt(a);
        System.out.println(c);// it became 123
        System.out.println(a);// it is 123 but they are not same!!! This one is treated as String!!!

        // to distinguish them

        System.out.println(c+1); // this one is the int value 124
        System.out.println(a+1); // this one is the String one because  we concat the "1" to 123. So 1231

    }
}
