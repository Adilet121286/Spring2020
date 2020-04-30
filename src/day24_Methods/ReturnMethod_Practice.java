package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Practice {
    public static int maxNumber(int[] array){

        Arrays.sort(array);

        return array[array.length-1];

    }

    public static int minNumber(int[] array){

        Arrays.sort(array);

        return array[0];

    }


    public static void main(String[] args) {

        int[] arr = {9,7,6,88,99,444,234,32,556};

        int Max = maxNumber(arr);
        int Min = minNumber(arr);

        System.out.println(Max);
        System.out.println(Min);


    }
}
