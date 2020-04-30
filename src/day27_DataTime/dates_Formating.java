package day27_DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates_Formating {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/yyyy/dd");



        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        System.out.println("==================================");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yy");

        LocalDate date2 = LocalDate.of(1999,12,25);
        String dataFormated  = date2.format(dtf2).toString();
        System.out.println(dataFormated);


    }
}
