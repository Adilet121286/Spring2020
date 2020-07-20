package Review_Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {


}

class A{
    protected void mA(){
        System.out.println("mA");
    }
}

class B extends A{
    public void mA(){

        //B f = new A();

    }
}

class Test{
    public static void main(String[] args) {
        A obj = new B();
        obj.mA();
    }
}
