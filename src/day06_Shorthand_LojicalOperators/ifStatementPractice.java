package day06_Shorthand_LojicalOperators;

public class ifStatementPractice {

    public static void main(String[] args) {

        int a = 200;
        int b = 200;

        if(a > b){
            System.out.println(a+" is greater than "+b);
        }
        if(b > a) {
            System.out.println(b + " is greater than " + a);
        }
        if(b == a) {
            System.out.println(b + " is equal to " + a);
        }

        if(a>b && b <a && a==b){

        }

        System.out.println("===============================");

        int x=1000;
        int y=500;
        boolean xGreater=x>y;
        boolean yGreater=y>x;
         if (xGreater){
             System.out.println(x+" is greater than "+y);

         }
        if (yGreater){
            System.out.println(y+" is greater than "+x);

        }
        if (xGreater==false && yGreater==false){
            System.out.println(y+" is equal to "+x);

        }



    }

}
