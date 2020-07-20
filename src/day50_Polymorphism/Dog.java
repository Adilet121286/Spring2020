package day50_Polymorphism;

/*
  3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

public final class Dog extends Animal{ // 3 var, 3 methods
    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.println("Dog "+ dogName+ " is eating");
    }

    public void sleep(){
        System.out.println("Dog "+ dogName+ " is sleeping");
    }

    public void bark(){
        System.out.println("Dog "+ dogName+ " is barking");
    }


    public static void methodA(int a){
        System.out.println("Dog Class A");
    }


}