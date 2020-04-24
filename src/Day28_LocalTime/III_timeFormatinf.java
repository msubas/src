package Day28_LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class III_timeFormatinf {
    public static void main(String[] args) {

       // DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a"); 04:30 PM
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm:ss a");//04:30:00 PM
        LocalTime time=LocalTime.of(16,30);

        System.out.println(time.format(dtf));
    }
}
