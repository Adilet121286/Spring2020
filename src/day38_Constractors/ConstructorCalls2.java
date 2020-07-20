package day38_Constractors;

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a) {
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str) {
        //   System.out.println(" Hello");
        this(10); // default , & int arguments
        //  this();
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2("Hello");



    }


    public void method1() {
        // ConstructorCalls2();
    }

    {

    }





}
