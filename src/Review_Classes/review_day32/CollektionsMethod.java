package Review_Classes.review_day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollektionsMethod {
    /*
           1. write a program that can return the second maximum number from Arraylist
                   Ex: {1,2,3,4,5,6,7,8,8};
                           output: 7
           2. write a program that can return the second minimum number from Arraylist
               Ex: {1,1,2,3,4,5,6,7,8,8};
                  output: 2
        */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        list.removeAll(Arrays.asList(max, min));
        System.out.println(list);

        Integer secondMax = Collections.max(list);
        Integer secondMin = Collections.min(list);
        System.out.println(secondMax);
        System.out.println(secondMin);

    }
}
