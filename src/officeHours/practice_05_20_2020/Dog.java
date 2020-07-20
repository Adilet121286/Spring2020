package officeHours.practice_05_20_2020;

public class Dog extends Pet{
    /*
	Dog:
		variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: eat, sleep, drink, toString, bark
    not inherited: bark
     */

    public void bark(){
        System.out.println(name+ " is barking");
    }

    public Dog(String name,int age,String color,String size,String breed){
        setInfo(name,age,color,size,breed);
    }

}
