package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class XIII_ArrayList {
    public static void main(String[] args) {

        ArrayList <String> list=new ArrayList<>();

        list.add("Milk");
        list.add("Egg");
        list.add("Butter");
        list.add("Banana");
        list.add("Cheese");
        System.out.println(list);//[Milk, Egg, Butter, Banana, Cheese] i increase the size to 5 by adding new items

        int Listsize=list.size();
        System.out.println(Listsize);// 5

        for(int i=0; i<Listsize;i++){

            System.out.println(list.get(i)); // Milk Egg Butter Banana Cheese
        }
        //======================================================================
        int i=0;
        for(String each:list){
            System.out.println(list.get(i));// Milk Egg Butter Banana Cheese
            i++;
        }


    }
}
