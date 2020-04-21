package Saturday_Study;

public class XVI_Practice {
    public static void main(String[] args) {

int count=1;
            for(int m=6; m>0; m--) //How many rows
            {for(int i=0; i<m; i++){ // We add the " " (Spaces) before the numbers
            System.out.print(" ");}
            for(int j= 0; j<count; j++){ // Numbers
            System.out.print(count+" ");//
            }

            System.out.println();
            count++;
        }
    }
}
/*
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6

 */