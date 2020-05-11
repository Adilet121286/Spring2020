package day37_Constructors;

import day14_SrtingClassContinue.StringManipulation;

public class Car {
    String brand;
    String model;
    String year;
    double price;


    public Car(String brand, String model, String year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String toString(){
        return year+" "+brand+" "+model+" "+price;
    }


}
