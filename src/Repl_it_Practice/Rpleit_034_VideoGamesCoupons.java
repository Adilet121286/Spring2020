package Repl_it_Practice;

import java.util.Scanner;

public class Rpleit_034_VideoGamesCoupons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scanner.nextInt();
        int candies = numberOfCoupons/10;
        int gumballs = (numberOfCoupons%10)/3;

        String str1 = "";
        String str2 = "";

        if (numberOfCoupons>=3){
            str1 = "Number of Candies: "+candies;
            str2 = "Number of Gumballs: "+gumballs;

        }else{
            str1 = "Not enough coupons";
        }

        System.out.println(str1);
        System.out.println(str2);
    }
}
