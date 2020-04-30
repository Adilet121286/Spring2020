package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_102_ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] arr = sentence.split(" ");
        String result = "";

        for (int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);

        }



    }

}
