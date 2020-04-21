package Day22_ARRAYSLOOPS;

public class VI_EvenNumbersFromArray {
    public static void main(String[] args) {
       int [] arr= {1,2,3,4,5,6,7,8,9,10};
       // we will find the number of odd and even numbers

        int countOddnumbers=0;
        int countevenNumbers=0;

        for(int each:arr){

            if(each%2!=0){
                countOddnumbers+=1; //countoddnumbers++ same
            }
            else{
                countevenNumbers++;


          /*      if(each%2==0){
                    countevenNumbers++;
                    continue;
                }
            countOddnumbers++;
            This is the second way to solve the question
           */
            }
        }
        System.out.println("Total odd numbers "+ countOddnumbers);
        System.out.println("Total even numbers "+ countevenNumbers);



    }
}
