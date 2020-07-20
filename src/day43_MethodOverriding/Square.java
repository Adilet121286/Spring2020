package day43_MethodOverriding;

public class Square extends Shape {
    public double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void calculateArea(){
        area = side * side;
        System.out.println("Area of the Square: "+area);
    }

    @Override
    public void calculatePerimeter(){
        perimeter = (side + side) * 2;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}
