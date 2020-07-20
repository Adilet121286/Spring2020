package Repl_it_Practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] result = new int[nums.length * 2];

        result[result.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(result));

    }
}
