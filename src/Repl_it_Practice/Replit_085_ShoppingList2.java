package Repl_it_Practice;

import java.util.Scanner;

/*

    do {
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            countinue = scan.next();
            count++;
        }while (countinue.equalsIgnoreCase("yes"));

        System.out.println("ok");





 */

public class Replit_085_ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;



            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice +=price;
            shoppingListReport +="Item"+count +": "+ item + " Price: " + price;


            System.out.println("Add one more item?");
            countinue = scan.next();

            if(countinue.equalsIgnoreCase("yes")) {
                while (countinue.equalsIgnoreCase("yes")) {
                    ++count;
                    System.out.println("Enter Item" + count + " and its price:");
                    item = scan.next();
                    price = scan.nextDouble();
                    totalPrice += price;
                    shoppingListReport +=", Item"+count +": "+ item +" Price: " + price;


                    System.out.println("Add one more item?");
                    countinue = scan.next();

                    if (countinue.equalsIgnoreCase("no")) {
                        System.out.println(shoppingListReport);
                        System.out.println("Total price: "+totalPrice);
                        break;


                    }

                }

            }else{
                System.out.println(shoppingListReport);
                System.out.println("Total price: "+totalPrice);
            }







    }
}


