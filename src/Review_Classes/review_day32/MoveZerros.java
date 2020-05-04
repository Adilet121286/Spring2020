package Review_Classes.review_day32;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerros {
     /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

         int count =0;
         for(int i=0; i<list.size();i++){
             if (list.get(i).equals(0)){
                 count++;
             }
         }
         list.removeAll(Arrays.asList(0));
         System.out.println(list);
         for (int l=0; l<=count;l++){
             list.add(0);
         }
         System.out.println(list);
         System.out.println("=========================");


         ArrayList<String> strings = new ArrayList<>();
         strings.addAll(Arrays.asList("do","will","can","be","will","will"));
         System.out.println(strings);

         int verb = 0;
         for (String each: strings){
             if (each.equals("will")){
                 verb++;
             }
         }
         strings.removeAll(Arrays.asList("will"));
         System.out.println(strings);

         for (int i=0; i<=verb;i++){
             strings.add("will");

         }
         System.out.println(strings);



     }
}
