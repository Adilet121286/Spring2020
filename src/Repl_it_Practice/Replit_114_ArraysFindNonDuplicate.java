package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_114_ArraysFindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below



        Arrays.sort(nums);


        for( int each2 : nums ){

            int count = 0;
            for( int each : nums ){
                if(each == (each2)){
                    count++;
                }
            }

            if(count == 1){  // if the character is unique
                System.out.println(each2);
            }


        }
    }
}
