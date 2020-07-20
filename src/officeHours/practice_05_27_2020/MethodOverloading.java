package officeHours.practice_05_27_2020;

public class MethodOverloading {
    public void method(){

    }
    private int method(int a){
        return 4;
    }

    public static void meth(){

    }

    public  int meth(int a){
        return 4;
    }

    public MethodOverloading (){

    }

    public MethodOverloading (String a){

    }

    public static void main(String[] args) {
        System.out.println("String");
        main(3);
    }

    public static void main(int args) {
        System.out.println("int");
    }
}
