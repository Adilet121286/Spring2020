package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_183_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 2, 2));

        int sum2 = sum(list);
        System.out.println(sum2);


    }

    public static int sum(ArrayList<Integer> ints) {
        //write code here
        int result = 0;
        for (int each : ints) {
            result += each;
        }
        return result;
    }
}


