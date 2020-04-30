package Repl_it_Practice;

import java.util.Scanner;

public class Replit_110_Arrays_CountEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int countEvenNum = 0;
        for (int eachNum: nums){

            if (eachNum%2 == 0){
                countEvenNum++;
            }

        }

        System.out.println(countEvenNum);;

    }

}
