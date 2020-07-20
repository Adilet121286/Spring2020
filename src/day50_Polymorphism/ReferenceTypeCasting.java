package day50_Polymorphism;

import day47_Abstraction.RemoteWebDriver;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a;

        Dog dog = new Dog("Sharik", 2,"M");
        Animal animal1 = dog;

        Dog dog2 = (Dog) animal1;
        Cat cat = new Cat("Gha","N",9);
        //Dog dog2 = (Dog) cat;

        Animal animal2 = (Animal) cat;
        cat = (Cat)animal2;







    }
}
