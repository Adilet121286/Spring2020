package day38_Constractors;

public class EmployeeSalary {

    public static void main(String[] args) {
        SalaryCalculator zareen = new SalaryCalculator(50, 40, 8.25/100, 0.2);

        System.out.println( zareen.salary() );

        System.out.println(zareen);

        System.out.println("======================================================");
        SalaryCalculator Namik = new SalaryCalculator(62,40, 8.75/100, 0.26);

        System.out.println( Namik.salaryAfterTax() );




    }
}
