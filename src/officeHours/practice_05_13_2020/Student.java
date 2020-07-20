package officeHours.practice_05_13_2020;

import day37_Constructors.CybertekStudents;

public class Student {
    String name;
    long id;
    static String schoolName = "Cybertek";

    public String toString(){
        return "Student`s name is: "+this.name+", Student`s ID is: "+this.id+", School name is:"+schoolName;
    }

}

class studentObject{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Madina";
        student1.id = 123;

        Student student2 = new Student();
        student2.name = "Emrah";
        student2.id = 456;

        System.out.println(student1);
        System.out.println(student2);

    }

}
