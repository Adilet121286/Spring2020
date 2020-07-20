package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Replit_Arrays_Diving2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();
        for(int i= 1; i <=7; i++) {
            System.out.println("Enter score for judge " + i + ":");
            score.add(input.nextInt());
        }
        score.removeIf(p-> p == Collections.min(score) );
        score.removeIf(p-> p == Collections.max(score));
        float total = score.stream().reduce(0, (x,y)-> x+y);
        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();
        total *= diff*0.6;
        System.out.printf("Total: %.2f", total);
    }
}
