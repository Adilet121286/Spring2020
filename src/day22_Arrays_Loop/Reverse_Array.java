package day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //   0 1 2 3 4

        for(int i = arr.length -1 ; i >= 0; i--  ){
            int eachNum = arr[i];
            System.out.println(eachNum);
        }

        System.out.println("===================================");
        //[5, 4, 3, 2, 1]
        int[] RevArr = new int[arr.length]; // [0, 0, 0, 0, 0]
/*
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
 */

        int j = arr.length -1; //4
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }



        System.out.println(Arrays.toString(RevArr));


    }

}
