package officeHours.practice_05_13_2020;

import java.security.PublicKey;

public class Instances {
    String name;

    {
        name = "Adilet";
    }


    public void printName(){
        System.out.println("Name is: "+this.name);

    }

    public static void main(String[] args) {
        Instances obj = new Instances();
        obj.name = "Adilet";
        System.out.println(obj.name);


    }



}
