package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObject2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarInfo("BMW","X7",2020,"White");

        car1.getCarInfo();
        car1.start();
        car1.drive();

        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Camry", 2020, "Red");
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi", "Q7", 2019, "Gray");
        car3.getCarInfo();

        Car car4 = new Car();
        car4.setCarInfo("Audi", "Q7", 2019, "Gray");
        car4.getCarInfo();

        Car car5 = new Car();
        car5.setCarInfo("Audi", "Q7", 2019, "Gray");
        car5.getCarInfo();

        System.out.println("================================");

        Car[] cars = {car1,car2,car3};

        for (int i=0; i<cars.length;i++){
            cars[i].getCarInfo();
        }
        System.out.println("================================");

        for (Car each: cars){
            each.getCarInfo();
        }

        System.out.println(car1);



    }
}
