package Classes_Variables;

public class BankAccount {

    int id;
    String name;
    double balance;


}


class BOA{

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();



        myAccount.id = 1;
        myAccount.name = "Amir";
        myAccount.balance=58.9;

        System.out.println(myAccount.id);
        System.out.println(myAccount.name);
        System.out.println(myAccount.balance);


        System.out.println(yourAccount.id);
        System.out.println(yourAccount.name);
        System.out.println(hisAccount.balance);

    }

}
