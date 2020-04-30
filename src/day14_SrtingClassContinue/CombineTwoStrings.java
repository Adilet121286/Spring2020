package day14_SrtingClassContinue;

    /*Warmup tasks:
        1. Ask user to enter two words. Print the first word, second word, second word, first word
        Input:
        one
        two
        Output:
        onetwotwoone
        DO NOT USE + OPERATOR
        */

import java.util.Scanner;

public class CombineTwoStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
            String word1 = input.next();

        System.out.println("Enter your first word:");
            String word2 = input.next();

            String result = word1.concat(word2).concat(word2).concat(word1);

        System.out.println(result);



    }
}
