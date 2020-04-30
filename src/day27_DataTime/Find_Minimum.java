package day27_DataTime;

import Resources.Library;

import java.util.ResourceBundle;

public class Find_Minimum {

    public static void main(String[] args) {
        int[] arr = {5,4,7,5,2,10,2,1,-2};
        int minimum = arr[0];

        for (int each : arr){
           if (each < minimum){
               minimum = each;
           }

        }
        System.out.println(minimum);
        System.out.println("==================================================");

        int[] arr2 = {1,2,3,2,1,2,3,};
        System.out.println(minNumber(arr2));
        System.out.println("==================================================");

        double[] arr3 = {1.2, 1.1, 3.4, 6.5};
        System.out.println(minNumber(arr3));




    }

    public static int minNumber (int[] array){
        int minimum = array[0];

        for (int each : array){
            if (each < minimum){
                minimum = each;
            }

        }
        return minimum;
    }

    public static double minNumber (double[] array){

        double minimum = array[0];

        for (double each : array){
            if (each < minimum){
                minimum = each;
            }

        }
        return minimum;

    }

}
