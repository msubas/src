package Day13_ScannerString;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PRACTICE_I {
    public static void main(String[] args) {
        /*
        Cybertek
        School
String fname=myname.substring(0,5+1);
       String lname= myname.substring(7,11+1);
       String gmail=fname.concat("_").concat(lname).concat(
               "@gmail.com");
        output :CS
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String fn=input.next();
        System.out.println("Enter your last name");
        String ln=input.next();

        String c=fn.substring(0,1);
        String d=ln.substring(0,1);
        String initials=c+d;
        System.out.println(initials);




    }
}
