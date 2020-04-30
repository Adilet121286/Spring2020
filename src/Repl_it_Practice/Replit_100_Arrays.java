package Repl_it_Practice;

import java.util.Scanner;

public class Replit_100_Arrays {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){

            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!

        int k = 0;
        while (k<arr.length){

            String word = arr[k];
            String subWord = arr[k].substring(0,3);
            System.out.println(subWord);
            k++;

        }



    }
}
