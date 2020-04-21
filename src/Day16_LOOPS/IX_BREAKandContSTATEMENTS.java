package Day16_LOOPS;

public class IX_BREAKandContSTATEMENTS {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);

            for(int a=0; a<20;a++){
               if(a%2==1){
                System.out.print(a+" ");
            }
        }}
    }

}
