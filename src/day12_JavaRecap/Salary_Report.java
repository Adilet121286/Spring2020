package day12_JavaRecap;

import java.util.Scanner;

public class Salary_Report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter your company name");
        String companyName = scanner.nextLine();

        System.out.println("Enter your SSN:");
        long ssnNum = scanner.nextLong();

        scanner.nextLine();

        System.out.println("Enter your JobTitle: ");
        String jobTitle = scanner.nextLine();

        System.out.println("completed");

        System.out.println("Full name is: "+fullName);
        System.out.println("Job title name: "+jobTitle);
        System.out.println("Company name:"+companyName);
        System.out.println("SSN is: "+ssnNum);
        System.out.println("Salary is: &"+salary);
    }
}
