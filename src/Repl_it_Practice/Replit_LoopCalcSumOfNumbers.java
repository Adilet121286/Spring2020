package Repl_it_Practice;

import java.util.Scanner;

public class Replit_LoopCalcSumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;


        for(int i = 1; i<=n; i++){
            res +=i;

        }

        System.out.println(res);







    }

}
