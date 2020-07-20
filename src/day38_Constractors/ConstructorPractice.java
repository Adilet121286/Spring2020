package day38_Constractors;

public class ConstructorPractice {
    public ConstructorPractice(){
        this(10.0); //C
        System.out.println("A");
        // this(0.5); // rule #3
    }

    public ConstructorPractice(int a){
        this(); // C A
        // this(10.5);
        System.out.println("B"); // B

    }

    public ConstructorPractice(double a){
        //   this();  // rule #5
        //  this(5.5); // // rule #5
        //  this(10);  // rule #5

        System.out.println("C");

    }


    public static void main(String[] args) {
        new ConstructorPractice(10);

    }

}
