package Wednesday3;

public class IV_ForEachLOOP {
    public static void main(String[] args) {

        //FOR EACH
        int[] arr = {1, 2, 3, 4};

        for (int eachelement : arr) {//we used the for each loop
            // and we exclude 3. Therefor,
            // we skip 3==> 124
            if (eachelement == 3)
                continue;

            System.out.print(eachelement);
        }
        System.out.println("\n" + "================");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int each : arr2) {
            if (each % 2 == 1) {
                continue;
            }
            System.out.println(each);
        }
    }    }


/*

for each loop:

for(data type variable name: Arrayname){}

 */