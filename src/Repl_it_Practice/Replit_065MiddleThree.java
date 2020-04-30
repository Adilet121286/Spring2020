package Repl_it_Practice;

import java.util.Scanner;

public class Replit_065MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int length = word.length();
        String string = "";

        if (length % 2 != 0 && length >=5) {
            string = ""+word.charAt((word.length() / 2) - 1)
                    + word.charAt((word.length() / 2))
                    + word.charAt((word.length() / 2 + 1));

        }else {
            string = "invalid";
        }

        System.out.println(string);


    }

}
