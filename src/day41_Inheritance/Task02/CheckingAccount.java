package day41_Inheritance.Task02;

public class CheckingAccount extends BankAccount{

    public void withdraw(int amount){
        balance -=amount;
    }

}
