package Day13_ScannerString;

public class lastIndexOF {
    public static void main(String[] args) {
        String fullname="Kuzzat Altay";
        String firstname=fullname.substring(0, fullname.indexOf(" "));
         String lastname= fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);
    }
}
