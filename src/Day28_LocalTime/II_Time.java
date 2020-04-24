package Day28_LocalTime;

import java.time.LocalTime;

public class II_Time {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(23, 50, 30);

        System.out.println(time2);}}
/*
LocalTime: hours, minutes, seconds
        by default : 24hr
    LocalTime now = LocalTime.now(); ==> returns the current time
    LocalTime time1 = LocalTime.of(hour, minutes, second)
LocalDateTime:
DateTimeFormatting:

            year: yy, yyyy
            months: MM, MMM, MMMM
            days: dd
            days name: E, EEEE
            hours: hh
            minutes: mm
            second: ss

 */


