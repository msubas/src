package Day22_ARRAYSLOOPS;

public class V_HowManytimesthatword {
    public static void main(String[] args) {

        String sentence=" I like java,python and javascript";
        int countjava=0;
        int countpyton=0;

        String [] words= sentence.split(" "); // with this step I will create
                                    //Array
        for (String each:words){
            if(each.contains("java")){
                countjava+=1;
            }
            if(each.contains("python")){
                countpyton+=1;
            }
        }System.out.println(countjava);
        System.out.println(countpyton);
        System.out.println(countjava==countpyton);



    }
}
/*

USe Array and for each loop
 */