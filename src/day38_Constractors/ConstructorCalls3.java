package day38_Constractors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9);
        System.out.println("default");

    }

    public ConstructorCalls3(int a){
        System.out.println("Int argument");
    }

    public static void main(String[] args) {
        ConstructorCalls3 obj1 = new ConstructorCalls3();
    }




    public void method1(){

    }

}
