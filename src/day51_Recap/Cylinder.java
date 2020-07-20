package day51_Recap;

/*
5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
				variables: radius, Height

				set a static block that initialize the name to "Circle"
				set a constructor that can initialize the radius and height

				Note:	Volume of Cylinder = PI * radius * radius * height
			Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
			Perimeter of Cylinder = 2 * (PI * diameter + height)

 */

public final class Cylinder extends Shape implements Volume, PI{
    public double radius, height;

    static {
        name = "Cylinder";
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;

    }

    @Override
    public double calculateArea(){
        return (PI * (radius * 2) * radius) + (height * PI * (radius * 2));
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (PI *(radius * 2) + height);
    }

    @Override
    public   double calculateVolume(){
        return  PI * radius * radius * height;
    }










}
