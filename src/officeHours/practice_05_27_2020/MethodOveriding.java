package officeHours.practice_05_27_2020;

public class MethodOveriding {
    public void method1(){
        System.out.println("Super class");

    }
}

class Test extends MethodOveriding{

    @Override
    public void method1(){
        System.out.println("Sub class ");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method1();
        MethodOveriding methodOveriding = new MethodOveriding();



    }
}
