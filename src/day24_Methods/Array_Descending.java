package day24_Methods;

import java.util.Arrays;

public class Array_Descending {

    public static void main(String[] args) {

        int[] arr1 = {1,2,33,44,54,1,45,6,15};

        int[] arr2 = {100,200,300,120,930};

        int[] arr3 = {1000,2000,3000,4000,5000};

        arr1  =  sordDescending(arr1);
        arr2 = sordDescending(arr2);
        arr3 = sordDescending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] sordDescending(int[] arr){

        Arrays.sort(arr);
        int [] RevArr = new int[arr.length];

        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            RevArr[i] = arr[j];
            j--;

        }
        return RevArr;
    }

}
