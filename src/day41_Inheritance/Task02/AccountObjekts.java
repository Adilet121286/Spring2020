package day41_Inheritance.Task02;

public class AccountObjekts {
    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(15000);
        obj.showBalance();

        System.out.println("====================");
        SavingAccount saving = new SavingAccount();
        saving.accountHolder = "Elif";
        saving.deposit(3000);
        saving.showBalance();



        System.out.println(saving);



    }
}
