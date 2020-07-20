package Repl_it_Practice_3;

import java.util.Arrays;

public class PopulateArray {
    public static int[] populate(int[] r) {


            for (int i=0; i<r.length;i++){
                r[i] = i+1;
            }
            return r;


    }

    public static void main(String[] args) {

        int[] res = populate(new int[3]);

        System.out.println(Arrays.toString(res));

    }

}
