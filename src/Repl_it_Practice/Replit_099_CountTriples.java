package Repl_it_Practice;

import java.util.Scanner;

public class Replit_099_CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        int countTriple = 0;

        for (int i=0; i<str.length()-2; i++){
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2) ){
                countTriple++;
            }

        }
        System.out.println(countTriple);



    }
}
