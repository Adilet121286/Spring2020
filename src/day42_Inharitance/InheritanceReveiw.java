package day42_Inharitance;

class B{
    public B(int a){
        System.out.println("int");
    }

    public B(double a){
        System.out.println("double");
    }

    public B(long a){
        // this(4.5); // double
        this(10); //int
        System.out.println("long"); // long
        // this(4.5);
    }

}

public class InheritanceReveiw extends B {

    public InheritanceReveiw(String a){
        super(19l); //int  long
        System.out.println("String"); // string
    }


    public static void main(String[] args) {

        InheritanceReveiw obj = new InheritanceReveiw("Hello");

    }



}
