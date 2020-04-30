package day10_Switch_Scanner;
import java.util.Scanner;

public class Rate_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary for a year: ");
        int yearSalary = scanner.nextInt();
        System.out.println("Enter how many hours do you work in one week:");
        byte hoursInWeek = scanner.nextByte();
        int hourlyRate = yearSalary/(hoursInWeek*4*12);
        System.out.println("Your hourly rate is: " + hourlyRate );


    }
}
