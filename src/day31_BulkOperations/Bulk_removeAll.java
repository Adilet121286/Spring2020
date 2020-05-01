package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3 ,4,5,6,7,8, 1, 3, 3, 3, 3, 3, 3, 3) );
        System.out.println(list);
        // remove 1, 3, 5, 8
/*
                Integer a = 1;
                list.remove(a);
                list.remove(a);
                Integer b = 3;
                list.remove(b);
                list.remove(b);
 */
        //  list.removeAll( Arrays.asList(3,1,5,8)  );

        Integer[] arr ={3,1,5,8};
        list.removeAll( Arrays.asList(arr) );


        System.out.println(list);

        System.out.println("=========================================================");
        // remove all names ahmed
        String[] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println(nameList);

        nameList.removeAll(  Arrays.asList("Ahmed")  );

        System.out.println(nameList);






        /*
             1. write a program that can remove duplicates from an arraylist
         */


    }
}
