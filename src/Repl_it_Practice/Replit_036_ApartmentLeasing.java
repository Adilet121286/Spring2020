package Repl_it_Practice;

import java.util.Scanner;

public class Replit_036_ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        String str = "";

        if (numberOfBedrooms == 1){
            startingPrice = 1100;
            str = "One Bedroom Selected\nStarting Price: "+startingPrice;
        }else if(numberOfBedrooms == 2){
            startingPrice = 1850;
            str = "Two Bedroom Selected\nStarting Price: " +startingPrice;
        }else if(numberOfBedrooms == 3){
            startingPrice = 2550;
            str = "Three Bedroom Selected\nStarting Price: " +startingPrice;
        }else{
            str = "No such Bedrooms available\nStarting Price: "+startingPrice;
        }

        System.out.println(str);
    }
}
