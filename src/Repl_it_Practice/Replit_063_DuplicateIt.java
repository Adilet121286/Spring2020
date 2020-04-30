package Repl_it_Practice;

import java.util.Scanner;

public class Replit_063_DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        String result = word1.concat(word2).concat(word2).concat(word1);

        System.out.println(result);



    }


}
