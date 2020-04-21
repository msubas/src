package Day19_ArRays;

public class V_InitilizationOFarray {

    public static void main(String[] args) {

      int[] arr={10,20,30};//size of the array is 3
        System.out.println();

        int[] arr2=new int[3];
        System.out.println(arr2[2]);
        //Since we did not assigned any numbers
        // default value is 0

        String[] Testers=new String[3];
        //String[] Testers= {"Mazhar","Fuat", "Ozkan"};

        Testers[0]="Ozkan";
        Testers[1]="Fuat";

        System.out.println(Testers[0]+" "+Testers[1]+" "+
                Testers[2]);
// out put is Ozkan Fuat null
        //we got null because I have not assigned anything
        //to index 2

    }
}
/*
Size of ARRAY
giving the values
Givining the size



 */