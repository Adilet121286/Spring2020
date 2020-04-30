package officeHours.practice_03_11_2020;

public class SalaryCalculator {

    public static void main(String[] args) {

        double rate = 55;
        double stateTax = 0.04;
        double federalTax =0.22;
        byte weeklyHours = 40;
        double salaryYear = rate * weeklyHours *4 *12;
        double stateTaxYear = salaryYear * stateTax;
        double federalTaxYear = salaryYear * federalTax;
        double totalTaxYear = stateTaxYear + federalTaxYear;
        double income = salaryYear - totalTaxYear;

        String first = "Your salary is: ";
        String second = "Your total tax is: ";
        String third = "Your income after tax is: ";
        String last = " USD";

        System.out.println(first + salaryYear + last + "\n" + second + totalTaxYear + last
                + "\n" + third + income + last );


    }
}
