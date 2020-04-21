package day17_d0WHILEDOloop;

public class XIV_RemoveDuplicates {
    public static void main(String[] args) {

        String str="AABCDABCD";
        int i=0;
        String nonDuplicated="";
        while (i<=str.length()-1){
            if(!nonDuplicated.contains(""+str.charAt(i))){
                nonDuplicated+=""+str.charAt(i);
            }
            i++;
        }
        System.out.println(nonDuplicated);
    }
}
