package Sunday2;

public class VII_Practice {
    public static void main(String[] args) {
        // Removing the Duplicates
        String mix = "asdfghjklqoeuASJALJPEWrytnnvkdjflsjifjfaosidjsdiuvuaweriwpmcZcSDHFISVKJNSDNSIN";
        // This is my String :)

        String duplicatesremoved = " ";// We will use this String to store the non duplicaded values

        for (int i = 0; i < mix.length(); i++) {
            if (!duplicatesremoved.contains(mix.substring(i, i + 1))) {
                // with this code we are saying that if duplicatesremoved(DR) String DOES not contains the character at the
                // index i to i+1
                duplicatesremoved += mix.substring(i, i + 1); // Concat the character to the String DR
            }
        }
        System.out.println(duplicatesremoved);// Print String DR
    }


}



