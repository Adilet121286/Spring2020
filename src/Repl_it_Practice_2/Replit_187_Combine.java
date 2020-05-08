package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_187_Combine {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("bobo", "bubu"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("coco", "xoxo"));


        System.out.println(combineAL(list1,list2));



    }



    public static ArrayList combineAL(ArrayList wordList1, ArrayList wordList2){
        ArrayList<String> result = new ArrayList<>();
        result.addAll(wordList2);
        result.addAll(wordList1);
        return result;


    }


}
