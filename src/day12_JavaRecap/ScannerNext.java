package day12_JavaRecap;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullAddress = "";
        System.out.println("Enter the number of the building");
        short Bnumber = scanner.nextShort();

        fullAddress+= Bnumber + " ";

        System.out.println("Enter the street name: ");
        String streetName = scanner.next();
        fullAddress +=streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType = scanner.next();
        fullAddress+=roadType+" ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = scanner.next();
        fullAddress+=cityName+" ";

        String state = scanner.next();
        fullAddress+=state+", ";

        int zipcode = scanner.nextInt();
        fullAddress+= zipcode;

        System.out.println("Address is: "+fullAddress);
    }
}
