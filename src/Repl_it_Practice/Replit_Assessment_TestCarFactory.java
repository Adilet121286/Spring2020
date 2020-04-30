package Repl_it_Practice;

import java.util.Scanner;

public class Replit_Assessment_TestCarFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        for (int i=2010; i<2013;i++ ){
            if (model.equals("Extravagant") && year==i){
                recalled = true;

            }
        }

        for (int k=2015; k<2019; k++){
            if (model.equals("Guzzler") && year == k){
                recalled = true;
            }
        }


        System.out.println(recalled);



    }
}
