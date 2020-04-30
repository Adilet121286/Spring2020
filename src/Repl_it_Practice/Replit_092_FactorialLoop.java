package Repl_it_Practice;

import java.util.Scanner;

public class Replit_092_FactorialLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long [] f = new long[n];


        long count = 0L;
        long factorial = 1L;
        for (int i = 0; i < f.length; i++){
            count++;
            f[i] = count;
            factorial *=count;

        }
        System.out.println(factorial);








    }

}
