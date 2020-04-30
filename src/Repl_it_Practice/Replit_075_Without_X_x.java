package Repl_it_Practice;

import java.util.Scanner;

public class Replit_075_Without_X_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        boolean b1 = (word.charAt(0) == 'x' || word.charAt(0) == 'X')
                && (word.length()-1 == 'x'|| word.length()-1 == 'X');

        boolean b2 = (word.charAt(0) == 'x' || word.charAt(0) == 'X')
                && !(word.length()-1 == 'x'|| word.length()-1 == 'X');

        boolean b3 = (word.length()-1 == 'x'|| word.length()-1 == 'X')
                && (word.charAt(0) == 'x' || word.charAt(0) == 'X');

        if (b1){

            for (int i = 1; i <=word.length()-2; i++){System.out.println(result);

                result += word.charAt(i);
            }

        }else if (b2){

            for (int i = 1; i <=word.length()-1; i++) {

                result += word.charAt(i);
            }
        }else if (b3){

            for (int i = 0; i <=word.length()-2; i++) {

                result += word.charAt(i);
            }

        }



        System.out.println(result);

    }
}
