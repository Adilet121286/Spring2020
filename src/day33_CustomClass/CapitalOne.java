package day33_CustomClass;

import java.lang.reflect.AnnotatedArrayType;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 1234567;

        Anna.checkingBalance();
        Anna.deposit(33);

        Anna.checkingBalance();

        Anna.withDraw(13);
        Anna.checkingBalance();

        System.out.println("==========================================");
        System.out.println(Anna);






    }

}
