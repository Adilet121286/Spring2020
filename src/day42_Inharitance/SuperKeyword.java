package day42_Inharitance;


class A {
    int a = 100;
    public A(double b){
        System.out.println(a);
    }

}

public class SuperKeyword extends A {
    int a = 100;


    public SuperKeyword(){
        super(3.0);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
       // SuperKeyword obj = new SuperKeyword();
        A obj = new A(2.3);



    }



}
