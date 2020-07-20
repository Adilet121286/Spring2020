package day52_Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A" };

        LinkedHashSet<String> set1 =  new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println("=====================================");

        Set<Integer> numbers = new TreeSet<>(Arrays.asList(4,2,4,5,7,4,9,0));

        System.out.println(numbers);




    }

}
