package day11_Scanner;

import java.util.Scanner;

/*
    2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */

public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = scanner.nextInt();

        System.out.println("Enter the state tax rate: ");
        byte stateTax = scanner.nextByte();
        double stateTaxPratcentage = stateTax / 100.0;

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = scanner.nextByte();
        double federalTaxPercentage = federalTax / 100.0;

        double totalTax = (federalTaxPercentage+stateTaxPratcentage)*salary;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax is: "+totalTax);


    }
}
