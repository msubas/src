package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {
        /*
        warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
         */
   double Agallon=3.785;
   double literamount=100;
   double gallonamount=3;
      double Alitter= 1/3.785;
        System.out.println(gallonamount +" gallon equals to " + ( gallonamount*Agallon)+ " liter"  );
        System.out.println( literamount + " liter equals to " + ( Alitter*literamount) + " gallon");




    }
}
