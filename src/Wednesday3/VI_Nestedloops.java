package Wednesday3;

import java.util.Arrays;

public class VI_Nestedloops {

    public static void main(String[] args) {

        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};

        for (int j = 0; j < arr2D.length; j++) {//j=index numbers of the 1D Arrays
            for (int i = 0; i < arr2D[j].length; i++) {// i=index num of the elements in 1D


                System.out.println(arr2D[j][i]);
            }


        }

                for (char[] each:arr2D  ){

                    System.out.print(Arrays.toString(each));

                }

            }

        }


