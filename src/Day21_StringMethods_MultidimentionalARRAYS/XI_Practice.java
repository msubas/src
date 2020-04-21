package Day21_StringMethods_MultidimentionalARRAYS;

public class XI_Practice {

    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@hotmail.com", "msubas@gmail.com", "mmsubas@gmail.com", "msubas@hotmail.com"};

       /* for (String Eachemail : emails) {
            if (!Eachemail.endsWith("gmail.com")) {
                System.out.println(Eachemail);

                there is another to solve the question is below

        */

       for (String Eachemail: emails) {
           if(Eachemail.endsWith("gmail.com")){
               continue;
            }
           System.out.println(Eachemail);
        }

    }}
