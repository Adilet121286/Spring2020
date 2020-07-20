package day48_Adstraction;

interface P{
    void method1();
}

interface Q{
    void method2();
}

abstract class R{
    abstract void method3();
}


public class extends_implements2 extends R implements Q,P{

    @Override
    public void method3() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method1(){

    }
}
