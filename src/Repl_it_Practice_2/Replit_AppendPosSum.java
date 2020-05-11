package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_AppendPosSum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-1,-3,4,5));

        System.out.println(appendPosSum(list));

    }
    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> positive = new ArrayList<>();



        for (int i=0; i<list.size();i++){
            if (list.get(i)<=0){
                continue;
            }else {


            }



        }
        return positive;

    }

}
