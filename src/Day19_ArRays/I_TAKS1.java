package Day19_ArRays;

public class I_TAKS1 {

    public static void main(String[] args) {

        String str="ABABC";
        String result="";

        for(int j=0;j<str.length()-1;j++) {
            char ch2 = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                if (ch == ch2) {
                    count++;
                }
            }
            System.out.println(result);


        }}}