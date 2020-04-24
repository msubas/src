package Day27_DateANDtime;

import java.time.LocalDate;

public class V_LOCALdateANDtime {

    public static void main(String[] args) {

        LocalDate date1=LocalDate.of(2020,4,23);
        System.out.println(date1); //2020-04-23

        LocalDate birthdate=LocalDate.of(1979,11,22);
        System.out.println(birthdate);// 1979-11-22

        boolean a= date1.isAfter(birthdate);
        System.out.println(a);// true
        boolean b= date1.isBefore(birthdate);
        System.out.println(b); //False
        boolean c= date1.isEqual(birthdate); // Are the dates same or not
        System.out.println(c);// false
        boolean d= birthdate.isLeapYear();
        System.out.println(d);

        LocalDate now= LocalDate.now(); //This is the other way to declaring the date.
        System.out.println(now);

        LocalDate birthday=LocalDate.of(1979,11,22);
        int month=birthday.getMonthValue();
        System.out.println(birthdate);
        System.out.println(month);

        String str=now.toString();
        System.out.println(str.replace("-","/"));
    }

}

/*

year, months, days
isAfter()
isBefore()
isEqual()
isLeapyear()
 */