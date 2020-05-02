package day32;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]
     */


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();


        for(int i =0; i < list.size(); i++){

            int count = 0;
            for(String each: list){
                if( each.equals( list.get(i) )  ){
                    count++;
                }
            }

            if(count >1 && !duplicates.contains(list.get(i) ) ){
                // if the frequency is greater than one , and if it's not contained in duplicates yet, then we will add the object to the duplicates
                duplicates.add(  list.get(i)  );

            }

        }

        System.out.println(duplicates);


/*
        //list.get(0)  ==> "A"
        int count = 0;
        for(String each: list){
            if( each.equals( list.get(i) )  ){
                count++;
            }
        }
        if(count >1){
            duplicates.add(  list.get(i)  );
        }
  */




    }
}
