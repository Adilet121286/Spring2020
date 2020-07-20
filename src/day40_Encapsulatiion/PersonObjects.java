package day40_Encapsulatiion;

public class PersonObjects {
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        Zarina.setID(12345);
        Zarina.setSSN(456789);

        System.out.println(Zarina);

        Person Madina = new Person("Madina");
        Madina.setID(93837);
        Madina.setSSN(3384949);

        System.out.println(Madina);

        Person Muhtar = new Person("Muhtar");
        Muhtar.setID(34333);
        Muhtar.setSSN(4455667);

        System.out.println(Muhtar);


    }
}
