package Saturday_Study;

import java.util.Scanner;

public class V_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word=input.next();

        int a1=word.length()-1;
        boolean a2=word.startsWith("x")||word.startsWith("X");
        boolean a3=word.endsWith("x")||word.endsWith("X");
        if(a2&&a3){
            System.out.println(word.substring(1, a1));
        }else if(a3){
            System.out.println(word.substring(0,a1));
        }else if(a2){
            System.out.println(word.substring(1,a1+1));
        }else{
            System.out.println(word);}
    }}




/*Given a string word, if the first or last chars are
'x' or 'X', print the string without
those 'x' or 'X' chars,
otherwise print the string unchanged.
String str =scan.next();
                //we want to remove the duplciates
        String result = "";
        for (int i = 0; i <= str.length()-1; i++){
           if(result.contains(""+str.charAt(i))){
               continue;}
            result += str.charAt(i);}
        System.out.println(result);

 */