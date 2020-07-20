package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Replit_Arrays_Diving3 {

    public static void main(String[] args) {
        //WRITE YOUR CODES HERE

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i<8;i++){
            System.out.println("Enter score for judge "+i+":");
            int point = scanner.nextInt();
            list.add(point);
        }

        System.out.println("Enter difficulty:");
        double difficulty = scanner.nextDouble();


        Collections.sort(list);
        list.remove(0);
        list.remove(list.size()-1);

        int sumOfPoints = 0;
        for (Integer each: list){
            sumOfPoints +=each;
        }

        double total = sumOfPoints * difficulty* 0.6;



        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }


}
