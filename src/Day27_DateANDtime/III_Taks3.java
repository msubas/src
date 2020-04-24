package Day27_DateANDtime;

public class III_Taks3 {

    public static void main(String[] args) {
       int [] arr={1,234,6456,0,345,2,-1};
        minNumber(arr);}

    public static int minNumber(int[]arr) {
        int min=arr[0];
        for(int each: arr){
            if(each<min){
                min=each;}}
        System.out.println(min);
        return min;}}
