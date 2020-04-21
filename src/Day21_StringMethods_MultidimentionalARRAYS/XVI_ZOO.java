package Day21_StringMethods_MultidimentionalARRAYS;

public class XVI_ZOO {

    public static void main(String[] args) {

        String [] wildAnimals={"Tiger", "Lion", "Monkey","Turtle", "Corcodile"};

        String [] birds={"Eagle", "Duck", "Peacock", "Chicken"};

        String [][]zoo={wildAnimals,birds};
                  //index   0         1

        String a= zoo[1][3];
        System.out.println(a);
        // This is going to give me the Chicken
        System.out.println("=============");
        for( String eachbirds: zoo[1]){

            if (eachbirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachbirds);}

            System.out.println("============");

            for(String eachwildA:zoo[0]){
                if(eachwildA.equals("Turtle")){
                    break;
                }
                System.out.println(eachwildA);
            }

        }

    }

