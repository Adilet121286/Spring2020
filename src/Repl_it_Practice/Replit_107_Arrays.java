package Repl_it_Practice;

import java.util.Scanner;

public class Replit_107_Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below


        int count = 0;
        for (int o = 0; o<nums.length; o++){
            int eachNumber = nums[o];

            if (eachNumber % 2 == 0){
                count++;
            }



        }
        System.out.println(count);



    }
}
