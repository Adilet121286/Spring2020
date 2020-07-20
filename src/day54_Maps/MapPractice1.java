package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {


        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Taha", LocalDate.of(1998, 07, 16));
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Saban", LocalDate.of(1453,01,01));
        classMates.put("Anna", LocalDate.of(1990,2,25));
        classMates.put("Yucel", LocalDate.of(2005, 12, 28));
        System.out.println(classMates);

        classMates.put("Namic", LocalDate.of(1990,4,5));
        System.out.println(classMates);
        classMates.put("Anna", LocalDate.now());
        System.out.println(classMates);
        classMates.remove("Anna");
        System.out.println(classMates);

        boolean b1 = classMates.containsKey("Adilet");
        System.out.println(b1);
        classMates.clear();
        System.out.println(classMates);

        System.out.println("======================================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();


        for (String eachKey: students.keySet()){
            int eachValue = students.get(eachKey);
            if (eachValue<90){
                badStudents.put(eachKey,eachValue);
            }else {
                goodStudents.put(eachKey,eachValue);
            }
        }

        System.out.println(badStudents);
        System.out.println(goodStudents);







    }

}
