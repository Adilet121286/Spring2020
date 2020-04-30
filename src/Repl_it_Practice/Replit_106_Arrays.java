package Repl_it_Practice;

import java.util.Scanner;

public class Replit_106_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] arr=sentence.split(" ");
        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }

    }
}
