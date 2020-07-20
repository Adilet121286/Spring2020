package day46_final_abstract;

public class Circle extends Shape{

    public double radius;
    public final static double PI = 3.14;


    @Override
    void Area(){
        double area = radius * radius * PI;
        System.out.println("Area of Circle is: "+area);

    }

    public Circle(double radius){
        this.radius = radius;

    }


}
