package Repl_it_Practice;

import java.util.Scanner;

public class Replit_079_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        int lastIndex = txt.length()-1;
        String result = txt.substring(0,lastIndex);


        System.out.println(result);

    }
}
