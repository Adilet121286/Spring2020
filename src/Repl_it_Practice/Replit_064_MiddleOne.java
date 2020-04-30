package Repl_it_Practice;

import java.util.Scanner;

public class Replit_064_MiddleOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        String middleChar = "";

        int totalCharacters = word.length();
        int middleNum = totalCharacters/2;


        if (totalCharacters >=3) {

            if (totalCharacters % 2 != 0) {

                middleChar = "" + word.charAt(middleNum);

            } else {
                middleChar = "" + word.charAt(middleNum - 1) + word.charAt(middleNum);
            }

        }else if (totalCharacters ==1 ){
            middleChar = ""+word.charAt(0);
            middleChar = middleChar.concat(middleChar).concat(middleChar);
        }else if (totalCharacters ==2) {
            middleChar = ""+word.substring(0,2);
            middleChar = middleChar.concat(middleChar);
        }


        System.out.println(middleChar);


    }
}
