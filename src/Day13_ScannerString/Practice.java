package Day13_ScannerString;



public class Practice {

    public static void main(String[] args) {

       String myname="Mehmet Subas";
       String fname=myname.substring(0,5+1);
       String lname= myname.substring(7,11+1);
       String gmail=fname.concat("_").concat(lname).concat(
               "@gmail.com");
        System.out.println(gmail);

        String s1="I love Java Programing Language";
        String classname=s1.substring(7);
        System.out.println(classname);


    }
}
