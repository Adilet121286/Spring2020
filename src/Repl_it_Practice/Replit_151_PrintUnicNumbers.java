package Repl_it_Practice;

import java.util.Scanner;

public class Replit_151_PrintUnicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int result =0;


        for (int eachNum : nums){

            int count = 0;
            for (int i = 0; i<nums.length;i++){
                if (nums[i] == eachNum ){
                    count++;

                }
            }
            if (count == 1){
                System.out.println(eachNum);
            }

        }





    }
}
