package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_nextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, McLean VA, 22034

        String fullAddress = "";

        System.out.println("Building Number: ");
        int Bnum = input.nextInt();
        fullAddress  += "full address is: "+Bnum;

        input.nextLine();

        System.out.println("Street: ");
        String street = input.nextLine();
        fullAddress +=street;
        System.out.println("Street is: "+street);

        System.out.println("Enter zipcode:");
        int zipcode = input.nextInt();
        fullAddress +=" "+zipcode;
        System.out.println("zipcode is: "+zipcode);

        input.nextLine();

        System.out.println("enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();
        fullAddress =" "+ cityState;

        System.out.println("Your full address is: "+fullAddress);

        input.close(); // closes the scanner






    }
}
