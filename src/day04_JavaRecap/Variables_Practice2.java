package day04_JavaRecap;

public class Variables_Practice2 {

    public static void main(String[] args) {

        /*
        task: write a program to find the area perimetr of the circule
            radious = ?
            Pi = 3.14

            Area = r*r*3.14
            P = 2*3.14*r
         */

        double radius = 2.5; // must
        double PI = 3.14;
        double area = radius * radius * PI;

        System.out.println("The area of the circle is: "+area);

        double perimetr = 2*radius*PI;

        System.out.println("The perimetr of the circle is: "+perimetr);

        double circle1R = 3;
        double circle2R = 5;

        boolean circle1 = circle1R > circle2R;
        boolean circle2 = circle2R > circle1R;
        System.out.println(circle1);





    }

}
