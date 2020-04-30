package Repl_it_Practice;

import java.util.Scanner;

public class Replit_loopCalculateMultipliedSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int multiple = 1;

        for (int i = 1; i <=n; i++){

            multiple *= i;
        }

        System.out.println(multiple);








    }

}
