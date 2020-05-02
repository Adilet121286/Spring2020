package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
    /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0) );
        System.out.println(list);

        int count = Collections.frequency(list,0);
        System.out.println(count);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for (int i=0; i<count;i++){
            list.add(0);
        }

        System.out.println(list);






    }
}
