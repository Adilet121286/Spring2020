package day42_Inharitance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {

            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();

            student1.setStudentInfo( "bahtiyar", 35,'M',2345,"testing" );
            student2.setStudentInfo( "abide", 32,'F',2378,"art" );
            student3.setStudentInfo( "byakl", 10,'M',2309,"soccer");



            ArrayList<Student> studentList = new ArrayList<>();
            studentList.addAll( Arrays.asList(student1, student2, student3)  );

            for(Student each  : studentList){
                //System.out.println( each );
                System.out.println("name: "+each.name+", ID: "+each.studentID);
            }





        }
}
