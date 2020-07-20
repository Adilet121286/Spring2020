package day43_MethodOverriding;

public class Circle extends Shape{
    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        area = PI * radius * radius;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = PI * radius * 2;
        System.out.println("Perimeter of the Circle: "+perimeter);
    }




}
