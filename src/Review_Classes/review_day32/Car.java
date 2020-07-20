package Review_Classes.review_day32;

public class Car {
    String color = "Red";
    String engine = "V6";

}

class CarObject{
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = car1;
        Car car3 = car2;
        car3.color = "Blue";
        System.out.println(car3.color);
        System.out.println(car1.color);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        Car car5;

        new Car();

        System.out.println(new Car().color);






















    }


}
