package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_PosSum {
    public static void main(String[] args) {

        ArrayList<Integer> aa = new ArrayList<>();
        aa.addAll(Arrays.asList(4,-6,3,-8,0,4,3));


        System.out.println(appendPosSum(aa));


    }
    //create your method below

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){
        ArrayList<Integer> positive = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<list.size(); i++){
            if (list.get(i)>0){
                positive.add(list.get(i));
                sum += list.get(i);


            }
        }

        positive.add(sum);
        return positive;
    }



}
