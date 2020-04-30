package Repl_it_Practice;

import java.util.Scanner;

public class Replit_1_4 {
    public static void main(String[] args) {
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");

        weight = scan.nextDouble();
         int cal1 =(int) ((30*0.0175*10*(weight/2.2))+(30*0.0175*8*(weight/2.2))+(0.0175*360*(weight/2.2)));


        System.out.println("Calories Burned: "+cal1);



    }
}
