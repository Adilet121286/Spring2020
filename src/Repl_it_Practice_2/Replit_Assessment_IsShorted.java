package Repl_it_Practice_2;

import java.util.Arrays;

public class Replit_Assessment_IsShorted {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        System.out.println(isSort(arr));
    }

    public static boolean isSort(int[] nums) {

        boolean result=true;

        int count =0;

        for (int i=0; i<nums.length-1;i++){
            if (nums[i]<nums[i+1]){
                count++;
            }
        }
        if (count == nums.length-1){
            result = true;
        }else {
            result = false;
        }
        return result;


    }
}
