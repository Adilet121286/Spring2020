package Repl_it_Practice_3;

import java.util.Arrays;
import java.util.Collections;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,};
        int res = missingNumber(array);
        System.out.println(res);

    }

    public static int missingNumber(int[] arr){


        int sum = 55;
        int missed = 0;
        for (int each: arr){
            missed+=each;
        }

        return sum-missed;
    }
}
