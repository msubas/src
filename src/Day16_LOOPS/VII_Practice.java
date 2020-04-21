package Day16_LOOPS;

public class VII_Practice {
    public static void main(String[] args) {

        String Capital="";
        String lower= "";

        for(char ch='A'; ch<='Z'; ch++){
            Capital+=ch;}



        System.out.println(Capital);

        for(char ch= 'a'; ch<='z'; ch++){
            lower+=ch;}

        String result="";
        for(int i=0; i<Capital.length(); i++){
      result += Capital.charAt(i)+""+lower.charAt(i)+" ";

        }
        System.out.println(result);
    }}