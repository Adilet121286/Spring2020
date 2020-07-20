package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put( "Zarina", 120000.0 );
        employeeInfo.put("Bakhodir", 110000.50);

        System.out.println(employeeInfo);
        System.out.println( employeeInfo.size() );

        System.out.println( employeeInfo.get("Zarina") );
        System.out.println( employeeInfo.get("Bakhodir") );

        employeeInfo.remove("Bakhodir");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Zarina", 130000.0);

        System.out.println(employeeInfo);












    }
}
