package Review_Classes.review_day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
         list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));

         ArrayList<String> dupl = new ArrayList<>();


         for (int j=0;j<list.size();j++){

             int count = 0;
             for (int i=0;i<list.size();i++){
                 if (list.get(i).equals(list.get(j))){
                     count++;
                 }
             }
             if (count>1 && !dupl.contains(list.get(j))) {
                 dupl.add(list.get(j));
             }

         }
         System.out.println(dupl);

         System.out.println("===================================");

         ArrayList<Integer> list2 = new ArrayList<>();
         list2.addAll(Arrays.asList(1,1,2,3,3));
         ArrayList<Integer> dupl2 = new ArrayList<>();



         for (int k=0; k<list2.size();k++){
             int count2= Collections.frequency(list2,k);

             if (count2>1 && !dupl.contains(list2.get(k))){
                 dupl2.add(list2.get(k));
             }

         }

         System.out.println(dupl2);






     }
}
