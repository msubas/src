package Day27_DateANDtime;

public class II_MoningTask {

    public static void main(String[] args) {
        int[] ARR = {111, 1, 2, 3, 1, 4, 5, 6, 7, 8, 6, 5, 4, 3, 2, 0};
    uniqueElements(ARR);}

        public static void uniqueElements(int[] arr){

            for(int each2: arr){
                int count = 0 ;
                for(int each   :  arr){
                    if(each == each2 ){
                        count++;}}
                if(count == 1){
                    System.out.println(each2);
                }}}}

/*
        3. write a method that can print out the unique elements from an int array
                    Ex: {1,1,2,3,3} ==> 2
                        {6,6,7,7,8,9} ==> 8 9
        4. write a method that can print out the unique elements from a double array
                    Note: Apply method overloading
*/