package Day27_DateANDtime;

public class X_Replit {
    public static void main(String[] args) {

    //}

    //public static int wordCount(String words) {

        String a = "Mehmet Mahir subas";
        int count=1;
        for (int i=0; i<a.length(); i++ ){
     if(a.charAt(i)==' '){
             count++;}
      } if(count==1){
                System.out.println("There is only "+ count + " word: "+ a);}

        else{System.out.println("There are "+ count + " words: "+ a);}}}

