package day51_Recap;
/*
1. create an abstract class named Shape
			variables: name(static)
			abstract methods: calculateArea(), calculatePerimeter();
					both methods return double
 */

public abstract class Shape {

    public static String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
