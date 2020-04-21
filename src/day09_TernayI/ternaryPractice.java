package day09_TernayI;

public class ternaryPractice {
    public static void main(String[] args) {

        String str= "";
        if (true){
            str= "hello";}
        else{
            str="Hola";
        }
        System.out.println(str);

        String str2= (true)? "hello" : "Hola";
        System.out.println(str2);


    }
}
