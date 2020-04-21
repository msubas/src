package Day10_SwitchandSCanner;

public class PrActice {
    public static void main(String[] args) {
        int num=1;
        String word= (num==0)? "Zero":
                (num==1)? "one":(num==2)? "two":
                        (num==3)? "Three":(num==4)? "four":
                                (num==5)? "five": "invalid";

        System.out.println(word);
    }
}
