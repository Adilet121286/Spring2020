package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Replit_Arrays_Diving {





        public static void main(String[] args) {
            //WRITE YOUR CODES HERE
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> scores=new ArrayList<>();
            for (int i=1; i<=7; i++) {
                System.out.println("Enter score for judge "+i+":");
                int score=scan.nextInt();
                scores.add(score);
            }
            System.out.println("Enter difficulty:");
            double difficulty=scan.nextDouble();
            Collections.sort(scores);
            scores.remove(0);
            scores.remove(5);
            int sum=0;
            for (Integer each:scores){
                sum+=each;
            }
            double total=sum*difficulty*0.6;
            System.out.printf("Total: %.2f", total);
        }





}
