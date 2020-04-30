package Repl_it_Practice;

import java.util.Scanner;

public class Replit_084_ZombieAttac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();


        int days = 0;
        String extinct = "";

        if (inhabitants <= 0) {
            extinct = "---- EXTINCT ----";
        } else {


            for (int j = inhabitants; j == inhabitants; j++) {
                System.out.println("Day " + days + " [" + inhabitants + "]");

            }

            for (int i = inhabitants; i >= 0; i--) {
                inhabitants /= 2;
                days++;
                System.out.println("Day " + days + " [" + inhabitants + "]");
                extinct = "---- EXTINCT ----";
                if (inhabitants == 1) {
                    break;
                }

            }
        }


        System.out.println(extinct);



    }

}
