package day17_d0WHILEDOloop;



public class XIII_Palindrom {

    public static void main(String[] args) {

        String str="level";
        String  reversed="";
        int index=str.length()-1;
        while(index>=0){
            reversed+=str.charAt(index);
            index--;
        }
        boolean palindrome=reversed.equalsIgnoreCase(str);
        System.out.println(palindrome);

        System.out.println(reversed);
    }
}
