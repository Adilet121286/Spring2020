package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_184_Remove {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.addAll(Arrays.asList(1.2,2.2,3.2,4.2,5.2));

        test(list);

    }


    public static void test(ArrayList<Double> dubs)
    {
        //write code here
        dubs.remove(0);
        dubs.remove(0);
        System.out.println(dubs);

    }
}
