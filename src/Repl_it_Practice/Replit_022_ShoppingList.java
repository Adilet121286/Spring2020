package Repl_it_Practice;

import java.util.Scanner;

public class Replit_022_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String item1 = scanner.nextLine();
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Item2 and its price:");
        String item2 = scanner.nextLine();
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Item3 and its price:");
        String item3 = scanner.nextLine();
        double price3 = scanner.nextDouble();

        double totalPrice = price1 + price2 + price3;
        String report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+
                ", Item3: "+item3+" Price: "+ price3;

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);








    }
}
