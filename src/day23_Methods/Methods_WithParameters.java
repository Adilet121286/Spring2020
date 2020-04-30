package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        byte age = scanner.nextByte();

        EligibleToByAlcohol(age);

    }



    public static void EligibleToByAlcohol(byte age){

        if (age >= 21){
            System.out.println("Eligible to by alcohol");
        }else {
            System.out.println("cannot buy");
        }

    }
}
