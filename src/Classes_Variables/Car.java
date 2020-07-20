package Classes_Variables;

public class Car {

    String color = "Red";
    String engine = "V6";

    String str = "hello";



    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = car1;
        Car car3 = car2;

        car3.color = "Blue";
        System.out.println(car3.color);
        System.out.println(car1.color);















    }


}
