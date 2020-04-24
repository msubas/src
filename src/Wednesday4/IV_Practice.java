package Wednesday4;

public class IV_Practice {

    //////////////////////////////////////////////////////////
    public static void main(String[] args) {

        eligiebleornot(17,true);
    eligiebleornot(21,true);
    smoking(40);}

    ///////////////////////////////////////////////////////////

    public static void eligiebleornot(int age, boolean Citizen) {
        if(age >=18 && Citizen==true){
            System.out.println("You are eligieble for voting"); }
        else { System.out.println("You are not eligible for voting");}}

    /////////////////////////////////////////////////////////////
    public static void smoking(int age) {
        if(age>21){System.out.printf("You can buy cigarate");}
        else {System.out.printf("You cannot");}}}

