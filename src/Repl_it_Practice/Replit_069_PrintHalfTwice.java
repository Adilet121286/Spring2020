package Repl_it_Practice;

import java.util.Scanner;

public class Replit_069_PrintHalfTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String result1 = "";
        String result2 = "";

        for (int i = 0; i<=word.length()/2-1; i++){

            result1 += word.charAt(i);
        }
        for (int r = 0; r<=word.length()/2-1; r++){

            result2 += word.charAt(r);

        }
        String result3 = result1.concat(result2);

        System.out.println(result3);

    }
}
