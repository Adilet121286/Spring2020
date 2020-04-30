package day11_Scanner;

import java.util.Scanner;

public class FirstAndLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.next();
        System.out.println("Enter your last name:");
        String lastName = scanner.next();
        System.out.println("Are you employed?");
        String YesNo = scanner.next();


        switch (YesNo){
            case "Yes, I am":
            case "yes, I am":
            case "Yes":
            case "yes":
                System.out.println("Enter your salary:");
                double salary = scanner.nextDouble();
                System.out.println("Full name is: "+ firstName+" "+lastName);
                System.out.println("Employed status: "+ YesNo);
                System.out.println("Salary is: "+salary);
                break;
                default:
                    System.out.println("Full name is: "+ firstName+" "+lastName);
                    System.out.println("Employed status: "+ YesNo);
                    System.out.println("Program advise: go to Cybertek and become a TESTER");
        }




    }
}
