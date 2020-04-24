package Day28_LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class IV_Practice {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);// 2020-04-24T10:20:22.112

        LocalDateTime dt2=LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println(dt2); //2020-04-24T10:26:35.758

        LocalDate date= LocalDate.of(2020,3,20);
        LocalTime time= LocalTime.of(11,25,30);

        LocalDateTime datetime=LocalDateTime.of(date,time);
        System.out.println(datetime); //2020-03-20T11:25:30

        LocalDateTime dateTime2= LocalDateTime.of(2020,3,20,11,23,45);
        System.out.println(dateTime2);//2020-03-20T11:23:45

    //    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("mm/dd/yyyy");
    //    LocalDate date4= LocalDate.of(2019,3,24);
    //    System.out.println(date4.format(dtf));
    }}
/*
LocalDate & Time

 */