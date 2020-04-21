package day09_TernayI;

public class TernaryIII {
    public static void main(String[] args) {
        int age=21;
        boolean elibility= (age>=21)? true:false;

        String a = (age>=21)? "can buy":"cant but it";
        System.out.println(elibility);
        System.out.println(a);
    }


}
