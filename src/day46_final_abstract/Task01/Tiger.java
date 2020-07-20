package day46_final_abstract.Task01;

public class Tiger extends Pets{


    public Tiger(String name, String color, String breed, int age, char gender){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    @Override
    public void eat(){
        System.out.println(name+" is eating");
    }

    @Override
    public void speak(){
        System.out.println(name+ " is roaring");
    }

    @Override
    public String toString(){
        return "Name: "+name+", Color: "+color+", Breed: "+breed+", Age: "+age+", Gender: "+gender;

    }
}
