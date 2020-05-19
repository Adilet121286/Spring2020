package day41_Inheritance.Task01;

public class employeeObjects {

    public static void main(String[] args) {


        Developer developer1 = new Developer(120_000, "Namik", 123, "Soft Dev", 'M');
        developer1.fixingBug();

        System.out.println(developer1);
        System.out.println("===============");

        Tester tester1 = new Tester("Adilet",130_000,456,"SDET",'M');
        tester1.reporting();
        tester1.testing();

        System.out.println(tester1);
        System.out.println("===============");

        BusinessAnalyst BA = new BusinessAnalyst("Mike",90_000,789,'F');
        BA.gathering();
        BA.writingReq();
        System.out.println(BA);
    }
}
