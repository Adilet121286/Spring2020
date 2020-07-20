package Repl_it_Practice_3;

public class Person {
    private String firstName ;
    private String lastName ;
    private int age ;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return firstName+" | "+lastName+" | "+age;
    }
    public Person(){
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}

class PersonObj{
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName());  //"undefined"
        System.out.println(person.getAge());       // -1
        System.out.println(person.toString());     //"undefined | undefined | -1"
        System.out.println("===========================");

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString());



    }
}
