package Day25_Method;

public class XIII_Replit {
    public static void main(String[] args) {

       double bill= waterTax(151); }

    public static double waterTax(double units){

        double bill = 0.0;
        System.out.println("waterTax"+"("+(int)units+")");

        if(units<=50){
            System.out.println("returns " + (50*0.60));}
        else if( units>50 && units<=100){
            System.out.println("returns " +((50*0.90)+((units-50)*(0.90))));}
        else if(units>100 && units<150){
            System.out.println("returns " +((50*0.90)+((units-50)*0.90)+50));}
        else if(units>=150){
            System.out.println("returns " +((50*0.90)+((units-50)*0.90)+100));}
        return units;
}
}
/*

This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .
 */