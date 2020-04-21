package Day22_ARRAYSLOOPS;


import java.util.Scanner;

public class ReplitBInary {


    public static void main(String[] args) {



                Scanner input = new Scanner(System.in);
                int[] binary = new int[8];
                for(int i =0; i < binary.length; i++) {
                    binary[i] = input.nextInt();
                }
                //TODO:
                int result=0;
                // formula=(00000011)₂ = (0 × 2⁷) + (0 × 2⁶) + (0 × 2⁵) + (0 × 2⁴) +
                // (0 × 2³) + (0 × 2²) + (1 × 2¹) + (1 × 2⁰) = (3)₁₀
                int binaryRev[]=new int[binary.length];
                int j=0;
                for (int i=binary.length-1; i>=0; i--) {
                    binaryRev[j]=binary[i];
                    j++;
                }
                for (int i=1; i<binaryRev.length; i++){
                    if (binaryRev[i]==1){
                        result+=1*Math.pow(2,i);
                    }
                }
                if (binaryRev[0]==1){
                    result+=1;
                }
                System.out.println(result);

    }}