package Day16_LOOPS;

import java.util.Scanner;

public class XII_DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str =scan.next();
                //we want to remove the duplciates
        String result = "";
        for (int i = 0; i <= str.length()-1; i++){
           if(result.contains(""+str.charAt(i))){
               continue;}
            result += str.charAt(i);}
        System.out.println(result);


}}
