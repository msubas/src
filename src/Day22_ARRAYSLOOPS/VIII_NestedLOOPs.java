package Day22_ARRAYSLOOPS;

public class VIII_NestedLOOPs {

    public static void main(String[] args) {
        //Index           0   1         0    1  2        0   1   2   3
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'}};
        //index             0           1             2
/*
arr2D [0][0]===A
arr2D [0][1]===B
arr2D [1][0]===C
arr2D [1][1]===D
arr2D [1][2]===E
arr2D [2][0]===F
arr2D [2][1]===J
arr2D [2][2]===H
arr2D [2][3]===I

 */

        // if I want to get the elements of the index 0

        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);
        }
// if I want to get the elements of the index 1
        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }
        // if I want to get the elements of the index 2
        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[2][i]);
        }
        System.out.println("===========================");
// my nested loop is going to as below
        for (int j = 0; j < arr2D.length; j++) {//j is the index number of 1D Array

            for (int i = 0; i < arr2D[j].length; i++) {//i represent the elements of the selected index's elements
                System.out.println(arr2D[j][i]);

  /*
  Below loop is doing the same job [j][i]
arr2D [0][0]===A
arr2D [0][1]===B
arr2D [1][0]===C
arr2D [1][1]===D
arr2D [1][2]===E
arr2D [2][0]===F
arr2D [2][1]===J
arr2D [2][2]===H
arr2D [2][3]===I

 */
            }
        }
    }
}
