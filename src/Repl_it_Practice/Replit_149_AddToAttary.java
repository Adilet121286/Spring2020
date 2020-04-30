package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_149_AddToAttary {

    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.

        int[] array1 = new int[r.length+1];
        for (int i = 0; i < r.length;i++){
            array1 [i] = r[i];
        }
        array1[array1.length-1] = n;
        System.out.println(Arrays.toString(array1));
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
