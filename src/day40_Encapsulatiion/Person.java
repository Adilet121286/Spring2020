package day40_Encapsulatiion;

public class Person {

    public String name;


    private long SSN;
    private long ID;


    public Person(String name) { this.name = name; }


    public long getSSN() { return SSN; }

    public void setSSN(long SSN) { this.SSN = SSN; }

    public long getID() { return ID; }

    public void setID(long ID) { this.ID = ID; }

    public String toString(){
        return "Name is: "+name+", SSN number: "+SSN+", ID: "+ID;
    }
}
