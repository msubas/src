package III_Wednesday;

public class III_ForloopTASK {

    public static void main(String[] args) {

      String name="Mehmet";
        String reverse = "";
      int lastindex=name.length()-1;
      for(int i=lastindex;i>=0;i-- ) {
          reverse += name.charAt(i);}
        System.out.print(reverse);
      if(reverse.equals(name)){
          System.out.println("Name is palindrom");}
      else {System.out.println(" is not palindrom" +
                  "name");}}}