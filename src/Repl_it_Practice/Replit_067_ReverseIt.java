package Repl_it_Practice;

import java.util.Scanner;

public class Replit_067_ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String str = "";

        if (word.length() == 5){

            for (int i=word.length()-1; i>=0; i--){

                str += ""+word.charAt(i);
            }

        }else if (word.length() < 5){
            str = "Too short!";
        }else {
            str = "Too long!";
        }

        System.out.println(str);

    }
}
