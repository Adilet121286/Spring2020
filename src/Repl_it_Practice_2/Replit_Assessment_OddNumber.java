package Repl_it_Practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_Assessment_OddNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11

        String result = "";


        int[] arr = new int[num2-num1+1];
        int j=num1;
        for (int i = 0; i<arr.length;i++){
            arr[i]=j;
            j++;
            if (arr[i] % 2 !=0){
                result+=arr[i]+" ";
            }

        }
        System.out.println(result);




    }
}
