package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while( it.hasNext() ){
            String s = it.next();
            if(s.contains("m") || s.contains("M")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("==================");

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );


        for (Iterator<String> I = students.iterator(); I.hasNext(); ){
            String studentsNames = I.next();
            if (studentsNames.toLowerCase().contains("m")){
                I.remove();
            }

        }
        System.out.println(students);

        System.out.println("==================");

        LinkedHashSet<String> students2 = new LinkedHashSet<>();
        students2.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );

        System.out.println(students2.removeIf(p -> p.toLowerCase().contains("m")));
        System.out.println(students2);

        System.out.println("==================");
        LinkedHashSet<String> students3 = new LinkedHashSet<>();
        students3.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );

        students3.removeAll(Arrays.asList("Mehmet", "Mohammed","Ozgur"));
        System.out.println(students3);

        System.out.println("==================");
        LinkedHashSet<String> students4 = new LinkedHashSet<>();
        students4.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );

        students4.retainAll(Arrays.asList("Yucel", "Sha", "Ahmet"));
        System.out.println(students4);

        System.out.println("==================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        boolean result = list.containsAll(Arrays.asList(5,6,9,8,11));
        System.out.println(result);






    }


}
