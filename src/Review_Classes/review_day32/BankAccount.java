package Review_Classes.review_day32;

public class BankAccount {
    int id = 10 ;
    String name = "Riaz";
    double balance  = 17.9;




}

class BankAccountTest{

    public static void main(String[] args) {

        BankAccount myAccount  = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Rahman";
        myAccount.balance = 12.8;

        yourAccount.id = 2;
        yourAccount.name = "Muhtar";
        yourAccount.balance = 23.4;

        hisAccount.id = 3;
        hisAccount.name = "Amir";
        hisAccount.balance = 34.8;

        System.out.println(yourAccount.name);



        System.out.println(myAccount);
        System.out.println(yourAccount);
        System.out.println(hisAccount);
        System.out.println(myAccount.name);

    }

}
