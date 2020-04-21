package day08_ELSEif;

public class Sundaytrys {
    public static void main(String[] args) {

        int housetotal= 21;
        int player=22;

if (player>21){
    System.out.println("The player busts. The house wins");}
else{
if (housetotal>player && housetotal<=21){
    System.out.println("The player loses");}
if (housetotal==player){
    System.out.println( "They are a draw");}
if (player>housetotal && player<=21){
    System.out.println("The player wins");}
if (housetotal>21){
    System.out.println("The house busts. The player wins"); }
}}

}
/*
in blackjack after the player asks to keep the house 4
things may happen.
1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the
player loses .
3)if the player score is equal to the house then they
are a draw.
4)if the player score is bigger then the house the player
wins.
player and house scores are represented by  player and
house int variables.
check them using ifs to determine the result.

 */