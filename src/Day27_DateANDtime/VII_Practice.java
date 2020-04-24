package Day27_DateANDtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VII_Practice {
    public static void main(String[] args) {
       // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy")=====>December/30/1999
       // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy") ======> Dec/30/1999
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy")  ;// 12/30/1999
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy"); // Thu 12/30/1999
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy"); // Thursday 12/30/1999
        LocalDate date1 = LocalDate.of(1979,11,22);
String str1=date1.format(dtf);
        System.out.println(str1);
    }}