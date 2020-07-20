package day46_final_abstract.Task01;

public abstract class Pets {
    String name,color,breed;
    int age;
    char gender;

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString(){
        return name + " sleeping";
    }


}
