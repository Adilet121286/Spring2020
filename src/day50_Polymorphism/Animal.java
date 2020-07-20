package day50_Polymorphism;

/*
 1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make them abstract we need this for today's example
 */
public abstract class Animal { // 2 var, 2 in method


    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void methodA(){
        System.out.println("Animal Class");
    }

}