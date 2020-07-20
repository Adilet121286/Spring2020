package day38_Constractors;

/*
Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){ // annual income
        return hourlyRate * weeklyHours * 48 ;
    }

    public double stateTax(){ // total tax paid to the state
        return salary() * stateTaxRate;
    }

    public double federalTax(){ // total tax paid to the federal
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){  // salary after tax
        return salary() -  ( stateTax() + federalTax() );
    }

    public String toString(){
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "Net Salary: $"+salaryAfterTax();
    }



}