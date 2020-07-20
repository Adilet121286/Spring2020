package Practice12;

 interface Test{

    void readB();
    abstract void watchT();


}

abstract class B implements Test{
     public void readB(){
         System.out.println("RB");
     }
}

