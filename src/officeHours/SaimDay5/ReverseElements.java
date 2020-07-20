package officeHours.SaimDay5;

import java.util.Arrays;

public class ReverseElements {

    /*
    3) Create a method that will accept an int array and
     reverse the order of elements. Return the reversed array.
    */

    public static void main(String[] args) {
        int a [] = {5,2,8,1,3,9};
        System.out.println(Arrays.toString(reverse(a)));
    }


    public static int [] reverse(int [] arr) {

        // 1, 2 ,3, 4 -> 4, 3, 2, 1
        // 4, 2, 3, 1
        // 4, 3, 2, 1

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        return arr;
    }



}
