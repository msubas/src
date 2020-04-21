package day06_Shorthnd_LogicalOperators;

public class night {

        public static void main(String[] args) {
            int num1 = 1;
            int num2 = 2;
            int num3 = 1;
            int biggest = num1;
            if (num2 > biggest ){
                biggest = num2;
            }
            if (num3 > biggest){
                biggest = num3;
            }
            System.out.println(biggest + " is the biggest number");
        }
    }

