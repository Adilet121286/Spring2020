package day46_final_abstract;

public class Traingle extends Shape {
    double length;
    double width;

    public Traingle(double length, double width){
        this.length = length;
        this.width = width;

    }
    @Override
    public void Area(){
        double area = length * width;
        System.out.println("Area of Triangle is: "+area);


    }
}
