package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_122_Arrays_ZombiAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int [] arr1 = new int[inhabitants.length];




           for (int i = 0; i < inhabitants.length; i++) {
               arr1[i] = inhabitants[i] / 2;

           }
           System.out.println(Arrays.toString(arr1));





    }

}
