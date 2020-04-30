package Repl_it_Practice;

import java.util.Scanner;

public class Replit_087_HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        String result = "";
        int i = word.length();

        boolean index0 = word.charAt(0) == 'j' && word.charAt(1) == 'a'
                && word.charAt(2) == 'v' && word.charAt(3) == 'a';

        boolean index1 = word.charAt(1) == 'j' && word.charAt(2) == 'a'
                && word.charAt(3) == 'v' && word.charAt(4) == 'a';

        if (index0){
            exists = true;

        }else if (index1){
            exists = true;
        }else {
            exists = false;
        }

        System.out.println(exists);


    }
}
