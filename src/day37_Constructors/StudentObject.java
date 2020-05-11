package day37_Constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Marina", 34, 'F', "Cybertek");
        // student1.setInfo("Marina", 34, 'F', "Cybertek");

        System.out.println(student1);

        Student student2 = new Student("Sha",35,'M',"Harvard");

        System.out.println(student2);


    }
}
