package Repl_it_Practice;

import java.util.Scanner;

public class Replit_1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        //your code here

        String result="";
        if (num1>num2 && num1>num3){
            result = "n1 is bigger";
        }else if (num2>num1 && num2>num3){
            result = "n2 is bigger";
        }else if (num3>num1 && num3>num2){
            result = "n3 is bigger";
        }

        System.out.println(result);







    }
}
