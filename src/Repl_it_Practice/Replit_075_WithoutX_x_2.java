package Repl_it_Practice;

import java.util.Scanner;

public class Replit_075_WithoutX_x_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";


        if (word.substring(0,1).equalsIgnoreCase("x")
                && !(word.substring(word.length()-1,word.length())).equalsIgnoreCase("x") ){
            result = word.substring(1,word.length());

        }else if (word.substring(word.length()-1,word.length()).equalsIgnoreCase("x")
                && !(word.substring(0,1).equalsIgnoreCase("x")) ){
            result = word.substring(0,word.length()-1);

        }else if (word.substring(0,1).equalsIgnoreCase("x")
                && word.substring(word.length()-1,word.length()).equalsIgnoreCase("x")){
            result = word.substring(1,word.length()-1);
        }else {
            result = word;
        }



        System.out.println(result);

    }
}
