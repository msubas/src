package Day18_NestedLOOP;

public class VIII_PRACTICe {
    public static void main(String[] args) {

        int y=1;

        do{
            if (y==3){
                y++;
                continue;
            }

            System.out.println(y);
           y++;
        }
        while( y<=5);

    }
}
