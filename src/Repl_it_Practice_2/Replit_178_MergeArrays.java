package Repl_it_Practice_2;

import java.util.Arrays;

public class Replit_178_MergeArrays {

    public static int[] mergR(int[] a,int[] b) {

        int[] arrays = new int[(a.length)+b.length];

        for (int i=0; i<a.length; i++){
            arrays[i] = a[i];
        }

        for (int j = 0; j<b.length; j++ ){

            arrays[j+a.length] = b[j];

        }

        return arrays;



    }//end mergR

    public static void main(String[] args) {

        int [] arr1 = {1,3,5};
        int [] arr2 = {2,4,6};
        int [] result = mergR(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }

}
