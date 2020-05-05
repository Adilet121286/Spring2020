package day34_CustomClass;

public class DogObject2 {
    public static void main(String[] args) {
        String food1 = "Chicken";
        String food2 = "Fish";

        String drink1 = "Milk";
        String drink2 = "Coffee";


        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");


        Dog dog2 = new Dog();
        dog2.setDogInfo("pomeranian", "Small",4, "White", "Ernie");


        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink1);
        dog1.drinking(drink2);

        dog2.playing("piano");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Husky", "Small",4, "White", "Ghost");

        System.out.println("========================================================================");

        Dog[] dogPark = {dog1,dog2,dog3,dog4};
        for (int i=0;i<dogPark.length;i++){
            dogPark[i].eating(food1);
        }

        for (Dog each: dogPark){
            each.drinking(drink1);
        }

        for(int i=0;i<dogPark.length;i++){
            dogPark[i].playing("football");
        }

        for (Dog each: dogPark){
            each.study("JAVA");
        }











    }
}