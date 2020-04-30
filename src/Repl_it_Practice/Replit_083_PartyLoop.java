package Repl_it_Practice;

import java.util.Scanner;

public class Replit_083_PartyLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        String guestList = "";
        String yesNo;

        System.out.println("Please enter guest name:");
        String name = input.nextLine();
        guestList +=name;



            System.out.println("Do you want to enter new guest name:");
            yesNo = input.nextLine();

            if (yesNo.equalsIgnoreCase("yes")) {

                while (yesNo.equalsIgnoreCase("yes")){
                    System.out.println("Please enter guest name:");
                    name = input.nextLine();
                    guestList += ", " + name;

                    System.out.println("Do you want to enter new guest name:");
                    yesNo = input.nextLine();

                    if (yesNo.equalsIgnoreCase("no")){
                        System.out.println("Guest's list: "+guestList);
                        break;

                    }
                }

            }else {
                System.out.println("Guest's list: "+guestList);
            }

    }

}
