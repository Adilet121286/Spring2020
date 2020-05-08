package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_190_ArrayList11 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

        list1 = appendPosSum(list1);
        System.out.println(list1);


    }



    public static ArrayList appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        Integer sum = 0;
        for (Integer each: list){
            if (each >0){
                result.add(each);
                sum +=each;
            }
        }

        result.add(result.size(),sum);

        return result;


    }
}
