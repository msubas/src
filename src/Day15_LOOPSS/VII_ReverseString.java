package Day15_LOOPSS;

public class VII_ReverseString {
    public static void main(String[] args) {

        String str="Java";
        String Rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+
                str.charAt(0);
        int lastindex=str.length()-1;

       String reverse2="";
        for (int i =lastindex; i>=0; i--){
            System.out.print(str.charAt(i));
         reverse2+=""+str.charAt(i);

    }
        System.out.println();
        System.out.println(reverse2);
}}