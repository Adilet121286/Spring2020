package Repl_it_Practice_2;

import java.util.Arrays;

public class Replit_176_Overloading1 {
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,4,6,44,5,33,0,100};
        System.out.println(max(arr1));


        double[] arr2 = {1.2, 4.6, 9.4, 66};
        System.out.println(max(arr2));


    }

    public static int max (int[] array){

        Arrays.sort(array);
        return array[array.length-1];

    }

    public static double max(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

}
