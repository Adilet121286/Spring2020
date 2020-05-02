package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NewNew {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 20, 4, 5, 6, 7, 8, 9, 9));
        ArrayList<Integer> unique = new ArrayList<>();


       for (int j=0; j<list1.size();j++){
           if (!unique.contains(list1.get(j))){
               unique.add(list1.get(j));
           }
       }


       Collections.sort(unique);
       int secondMaxNum = unique.get(unique.size()-2);
       int secondMinNum = unique.get(0+1);


       System.out.println(unique);
        System.out.println(secondMaxNum);
        System.out.println(secondMinNum);

    }
}
