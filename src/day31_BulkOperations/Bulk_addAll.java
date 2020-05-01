package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        /*
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(45);
        list.add(35);
        list.add(200);
        */

        list.addAll(Arrays.asList(30,20,40,50,45,35,200));

        Integer[] arr1 = {30,20,40,50,45,35,200,300,400,1000};
        list.addAll(Arrays.asList(arr1));

        System.out.println(list);
        System.out.println("====================================");
        String[] names = {"Murtaza", "Muhtar", "Kamil", "Sada", "Rustem"};
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameslist = new ArrayList<>();
        nameslist.addAll(Arrays.asList(names));

        nameslist.add("Osman");
        nameslist.remove("Muhtar");
        nameslist.add("Muhtar");
        nameslist.set(0,"Adilet");

        System.out.println(nameslist);

        System.out.println("=======================================");

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numbers));
        System.out.println(numList);




    }
}
