package day40_Encapsulatiion;

public class CredentialsObject {
    public static void main(String[] args) {
        Credentials facebook = new Credentials();
        facebook.setUserName("A.paulura");
        facebook.setPassWord("1234567");


        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());



    }
}
