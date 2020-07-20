package Review_Classes.onlineSchool;

public class CybertekSchool {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentName("Adilet");
        student1.setAge(33);
        student1.setGrade(3);
        student1.setHasITBackGround(false);

        System.out.println(student1);
        student1.takingBreaks();
        student1.studying();




    }



}
