package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replt_2Times {
    public static void main(String[] args) {
        ArrayList<Integer> result1 = new ArrayList<>(Arrays.asList(1,5,3,7));
        result1 = twoTimes(result1);
        System.out.println(result1);

    }



    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();


        for (int k=0; k < list.size();k++){
            result.add(list.get(k));
            result.add(list.get(k));


        }
        return result;



    }

}
