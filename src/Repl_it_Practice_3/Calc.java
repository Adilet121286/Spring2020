package Repl_it_Practice_3;

public class Calc {
    private int x;
    private int y;
    private int result;

    public int getResult(){
        return result;
    }

    public void setY(int y){
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void plus(){
        result = x+y;
    }

    public void minus(){
        result = x-y;
    }


}

class CalcObj{
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.setX(10);
        calc.setY(5);
        calc.minus();

        System.out.println(calc.getResult());

        calc.plus();
        System.out.println(calc.getResult());


    }
}
