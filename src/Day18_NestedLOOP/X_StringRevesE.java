package Day18_NestedLOOP;

public class X_StringRevesE {
    public static void main(String[] args) {

        String str="Java";
        String rev="";
        int lastIndex=str.length()-1;
        do{
          rev+= str.charAt(lastIndex) ;
            lastIndex--;
           }
        while(lastIndex>=0);
        System.out.println(rev);

    }
}
