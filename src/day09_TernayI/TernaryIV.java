package day09_TernayI;

public class TernaryIV {
    public static void main(String[] args) {
        int ageOFperson=21;
        String eligiletoVote="";
        if(ageOFperson>=18)
            eligiletoVote="You can vote";
                else{
            eligiletoVote="You cannot vote";}
        System.out.println(eligiletoVote);

                String youcanv2= (ageOFperson>=18)? " yes":"no";


    }
}
