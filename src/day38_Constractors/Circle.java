package day38_Constractors;

public class Circle {
    /*
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter: diameter * PI
     */

    static double PI;
    double radius;
    double diameter;

    static{
        PI = 3.14;
    }

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public String toString(){
        return "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+area()+
                ", Circles perimeter: "+perimeter();
    }



}