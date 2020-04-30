package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {
        double rate = 13;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        double salary = rate * weeklyHours * 52;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double income = salary - (stateTax+federalTax);


        System.out.println("Your salary is: "+salary);
        System.out.println("State tax is: "+stateTax);
        System.out.println("Federal tax is: "+federalTax);
        System.out.println("Total tax is: "+(stateTax+federalTax));
        System.out.println("Your income is: "+income);

    }

}
