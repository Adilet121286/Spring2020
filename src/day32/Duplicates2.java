package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));
        System.out.println(list);
        ArrayList<String> result = new ArrayList<>();



        for (int i=0; i<list.size();i++){

            int count = Collections.frequency(list, list.get(i));

            if (count>1 && !result.contains(list.get(i))){
                result.add(list.get(i));
            }
        }
        System.out.println(result);


    }
}
