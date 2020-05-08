package officeHours.practice_05_06_2020;

public class TestersObject {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Adilet","QA Tester",130_000,1133445566);
        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Onur", "Junior SDET",100000, 1234);
        System.out.println(tester2);

        tester1.smokeTesting();
        tester1.creatingTicket();

        tester2.smokeTesting();
        tester2.creatingTicket();


    }
}
