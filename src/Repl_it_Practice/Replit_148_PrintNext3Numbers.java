package Repl_it_Practice;

import java.util.Scanner;

public class Replit_148_PrintNext3Numbers {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3numbers(num);


    }

    public static void next3numbers (int num){

        System.out.println((num+1)+" "+(num+2)+" "+(num+3) );

    }


}
