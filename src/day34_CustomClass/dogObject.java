package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small",4, "White", "Ghost");

     /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
      */
/*
        System.out.println( dog1.breed );
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
 */

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");


        System.out.println( dog1 );
        System.out.println( dog2 );
        System.out.println( dog3 );

        System.out.println("============================================================");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");


        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll( Arrays.asList( dog1, dog2, dog3 ) );
        puppies.addAll(Arrays.asList(dog4, dog5));

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }

        System.out.println("=====================================");

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }

    }
}
