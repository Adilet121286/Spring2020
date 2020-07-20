package Repl_it_Practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_Arrays_FrontPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] num1 = new int[2];
        if (num.length<=2){
            System.out.println(Arrays.toString(num));
        }

        if(num.length>2){
            for (int i=0;i<num1.length;i++){
                num1[i] = num[i];
            }
            System.out.println(Arrays.toString(num1));
        }




    }
}
