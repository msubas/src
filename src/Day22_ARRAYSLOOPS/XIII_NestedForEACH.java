package Day22_ARRAYSLOOPS;

import java.util.Arrays;

public class XIII_NestedForEACH {

    public static void main(String[] args) {

        int [] arr= {1,2,3,4,5};

        for(int each: arr){
            //System.out.println(each);
        }

        int [][] arr2D={ {1,2,3}, {4,5,6}};

        for(int [] each1Darray:arr2D){

            System.out.println(Arrays.toString(each1Darray));
        }

        for(int [] each1Darray:arr2D){
            for (int eachElement:each1Darray){
                System.out.print(eachElement);
            }
        }
        System.out.println("\n"+"========================");


        char [][] ch2D={{'A','B'},{'C','D','E'}};

        for(char [] eaachindex:ch2D){
            for( char eachelement:eaachindex){
                System.out.print(eachelement);
            }
        }




    }
}
