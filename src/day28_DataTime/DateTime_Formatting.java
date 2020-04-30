package day28_DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,11,30,45);
        System.out.println(dateTime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEEE");

        System.out.println(dateTime1.format(dtf));


    }
}
