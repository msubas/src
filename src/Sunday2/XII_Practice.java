package Sunday2;


public class XII_Practice {

// Finding the longest String from  one dimensional string array

    public static void main(String[] args) {
        String arr[] = {"Mazhar", "Fuat", "Ozkan"}; // this is my string Array
        String longname= theLongestWord(arr);    // If I need to use the word  I can assing to another String
        System.out.println(longname);
        System.out.println(theLongestWord(arr));}// If I need to print the longest word I can print directly

    public static String theLongestWord(String[] arr) {
        String theLW = "";              // If you noticed those types of questions always we an empty String
                                        // We are going to use that String to assign the longest String
        int max = 0;                    // We need a number that we can use to compare the Strings and find the
                                        // lomgest one
        for (int i=0; i<arr.length; i++){ // always we have a loop
             if(arr[i].length()>max){     // In this stage I am comparing two length
                max=arr[i].length();      // and I am saying that if String is bigger than max,
                 theLW=arr[i];}}           // my new String is that one

        return theLW;
}}

