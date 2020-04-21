package Day21_StringMethods_MultidimentionalARRAYS;

public class XIV_ScrumTeam {
    public static void main(String[] args) {

        String [] DevTeam={"Mazhar", "Fuat", "Ozkan", "Cem"};

        String [] Testers={"Nergis", "Murat", "Ali Esad"};


        String[][] ScrumTeam={DevTeam , Testers};
                              // 0         1

        ScrumTeam[0][3]="Muhtar";
        System.out.println(ScrumTeam[0][3]);
        // We replace Cem with Muhtar
    String info= ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("=============");

        for(String eachemployee: ScrumTeam[0]){
            System.out.print(eachemployee+ " ");
            //if I am going to change the index number from
            // 0 to1 it is going to print the Testers' name
        }

    }
}
