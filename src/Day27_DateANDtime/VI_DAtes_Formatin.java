package Day27_DateANDtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VI_DAtes_Formatin {
    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");// MMM==> Feb

        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

    }
}
