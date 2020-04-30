package day28_DataTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formating {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(16,30);

        LocalTime time2 = LocalTime.of(12,0);



        System.out.println(time1.format(dtf));
        System.out.println(time2.format(dtf));

        boolean result1 = time1.isAfter(time2);
        boolean result2 = time1.isBefore(time2);
        System.out.println(result1);
        System.out.println(result2);



    }
}
