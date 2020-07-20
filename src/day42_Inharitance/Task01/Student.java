package day42_Inharitance.Task01;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */

public class Student extends Person {
    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String  clazz){
        setPersonInfo(name,age,gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }

    public void attendClass(){
        System.out.println(name+" is attending a class");
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString(){
        return "Name: "+name+" ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz+", school: "+schoolName;
    }
}
