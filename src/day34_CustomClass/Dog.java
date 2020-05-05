package day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drinking(String drinks){
        System.out.println(name+ " is drinking "+drinks);
    }

    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }

    public void study(String subject){
        System.out.println(name+" is studying "+subject);
    }



    public void setDogInfo(String breed, String size, int age, String color, String name){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;
        // this keyword is used for calling object instance (instance variables)
    }


    public String toString(){
        return "Dog Name: "+name+", breed: "+
                breed+", size: "+size+", color:"+color+", age: "+age;
    }




}
