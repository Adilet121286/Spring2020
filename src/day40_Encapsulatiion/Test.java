package day40_Encapsulatiion;

public class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //  System.out.println(obj.SSN);

        System.out.println(obj.getSSN());

        obj.setSSN(12345678);
        System.out.println(obj.getSSN());

    }
}
