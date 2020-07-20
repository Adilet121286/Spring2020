package day48_Adstraction;





public interface defaultMethod {

    default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {

    }


}

class N implements defaultMethod{


    public static void main(String[] args) {

        N obj = new N();
        obj.method();

    }

}
