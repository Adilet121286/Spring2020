package day46_final_abstract.Task01;

public class PetsObjects {


    public static void main(String[] args) {

        Dog dog = new Dog("Alakoz","white","stBernard",7,'M');
        System.out.println(dog);
        dog.sleep();
        dog.eat();
        dog.speak();
        System.out.println("=======================================================================");

        Cat cat = new Cat("Masha","orange","siam",3,'F');
        System.out.println(cat);
        cat.sleep();
        cat.eat();
        cat.speak();
        System.out.println("=======================================================================");

        Tiger tiger = new Tiger("Sherkhan","usual","Amur",12,'M');
        System.out.println(tiger);
        tiger.sleep();
        tiger.eat();
        tiger.speak();
        System.out.println("=======================================================================");

    }


}
