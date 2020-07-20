package day38_Constractors;

public class Dog {

    String name;
    String breed;
    int age;


    public Dog(){ // sets the dfeualt value for all instances
        name = "unkown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed){
        this.breed = breed;
        name = "unkown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "Unknow";
    }



    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }


/*
    public void method1(){
    }
    public void method1(int a){
    }
 */




}