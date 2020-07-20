package day50_Polymorphism;


interface I {

    abstract void InterfaceMethod1();
    void InterfaceMethod2();

}


abstract class A {
    public abstract void AbstractMethod1();
    abstract void AbstractMethod2();


}


public class Abstraction extends A implements I{

   @Override
    public  void AbstractMethod1(){

   }

   @Override
   protected void AbstractMethod2(){

   }

   @Override
   public void InterfaceMethod1(){

   }

   @Override
   public void InterfaceMethod2(){

   }



}
