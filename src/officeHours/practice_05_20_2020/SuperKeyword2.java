package officeHours.practice_05_20_2020;

class TestData{
    int num = 100;
    String name = "Cybertek";

    public void method(){
        System.out.println("Cybertek School");
    }

}

public class SuperKeyword2 extends TestData {

    int num = 200;
    String name = "MIT";

    public void method(){
        System.out.println("MIT School");
    }

    public SuperKeyword2(){
        super.method();  // Cybertek School
        System.out.println( this.num ); // 200
        System.out.println( super.name ); // "Cybertek
    }

    public static void main(String[] args) {
        SuperKeyword2 obj = new SuperKeyword2();


    }




}
