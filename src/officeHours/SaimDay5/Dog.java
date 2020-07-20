package officeHours.SaimDay5;

public class Dog {
    String breed;
    String name;
    double weight;

    public Dog(String breed, String name, double weight){
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public static void eat(){
        System.out.println("Dog is eating" );
    }

}
