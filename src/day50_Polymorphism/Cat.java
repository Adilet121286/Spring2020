package day50_Polymorphism;

/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */
public final class Cat extends Animal{ // 3 var, 3 ins method
    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName =catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }

}