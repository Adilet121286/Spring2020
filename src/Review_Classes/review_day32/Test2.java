package Review_Classes.review_day32;

public class Test2 extends test1 {


    public void Method(int a){
        System.out.println("C");

    }

    public static void main(String[] args) {
        Test2 o = new Test2();
       // o.method
    }


}
class test1{
    protected void Method(){
        System.out.println("A");
    }

    private void Method(int a){
        System.out.println("B");
    }


}


