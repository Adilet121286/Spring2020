package day47_Abstraction;

abstract class A{
    public abstract void method();
    public void metod2(){}

}



public class Abstract_VS_NonAbstract2 extends A {

    @Override
    public void method(){

    }

}


abstract class B extends A{


}
