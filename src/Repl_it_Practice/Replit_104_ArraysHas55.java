package Repl_it_Practice;

import java.util.Scanner;

public class Replit_104_ArraysHas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
        boolean result = true;


            for (int k = 0; k < nums.length-1; k++) {

                if (nums[k] == 5 && nums[k+1] == 5){
                    result = true;
                    break;


                }else {
                    result = false;
                }

            }


            System.out.println(result);





    }
}
