package Repl_it_Practice_3.Inharitance1;

import day41_Inheritance.Task02.SavingAccount;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public double getInterestRate(){
        return interestRate;
    }

    public SavingsAccount(double interestRate){
        this.interestRate = interestRate;
    }

}
