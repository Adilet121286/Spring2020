package Repl_it_Practice_3;

public class Car {
    public String make;
    public String model;
    public int numberOfDoors;
    public int topSpeed;
    public int price;

    public Car(String make, String model,int numberOfDoors,int topSpeed,int price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model,int topSpeed,int price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors,int topSpeed,int price){
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model,int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }


}
