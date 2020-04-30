package day18_NestedLoop;

import java.util.Scanner;

public class Replt_108_Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (j = 1; j <= n; j++) {

            for (i = 1; i <=j ; i++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
