package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog obj1= new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2= new Dog("Kito", 6, "Female");
        //System.out.println( obj2.dogName);
        //obj2.bark();

        obj2.eat();
        obj2.methodA();

        Animal animal1 = new Cat("A","F", 1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A",1,"f");

        // boolean r1 = d1 instanceof Cat; // there is no IS A relation between dog and cat

        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof Dog;

        System.out.println(r2);

    }

}
