package Repl_it_Practice;

import java.util.Scanner;

public class Replit_066_MergeThem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        String str1 = "";
        boolean merge = word1.length()==word2.length();

        if (merge && word1.length()<=3) {
            for (int i = 0; i <= word1.length() - 1; i++) {
                str1 += ""+word1.charAt(i) + word2.charAt(i);

            }
        }else {
            str1 = "cannot merge";
        }


        System.out.print(str1);

    }

}
