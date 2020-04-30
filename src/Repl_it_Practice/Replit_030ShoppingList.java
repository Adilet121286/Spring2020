package Repl_it_Practice;

import java.util.Scanner;

public class Replit_030ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String report = "";
        double totalPrice = 0;


        System.out.println("Enter Item1, count and its price:");
        String item1 = scanner.nextLine();
        int count1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scanner.nextLine();
        int count2 = scanner.nextInt();
        double price2 = scanner.nextDouble();


        scanner.nextLine();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scanner.nextLine();
        int count3 = scanner.nextInt();
        double price3 = scanner.nextDouble();


        if(count1>0 && count2>0 && count3>0){
            report = "Item1: "+item1+" Price: "+(count1*price1)+", Item2: "+item2+" Price: "+(count2*price2)
                    +", Item3: "+item3+" Price:"+(count3*price3);
            totalPrice = (count1*price1) + (count2*price2) + (count3*price3);

        }else if(count1<=0 && count2>0 && count3>0) {
            report = "Item2:" + item2 + " Price:" + (count2 * price2) + ", Item3: " + item3 + " Price: " + (count3 * price3);
            totalPrice = (count2*price2) + (count3*price3);

        }else if (count1>0 && count2<=0 && count3>0){
            report = "Item1: "+item1+" Price: "+(count1*price1)+ ", Item3: "+item3+" Price: "+(count3*price3);
            totalPrice = (count1*price1) + (count3*price3);

        }else if(count1>0 && count2>0 && count3<=0){
            report = report = "Item1: "+item1+" Price: "+(count1*price1)+", Item2: "+item2+" Price: "+(count2*price2);
            totalPrice = (count1*price1) + (count2*price2);

        }

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);


    }

}
