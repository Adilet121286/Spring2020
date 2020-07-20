package Review_Classes.onlineSchool;

public class Student implements OnlineEducation, Cybertek{

    private String studentName;
    private int age;
    private int grade;
    private boolean hasITBackGround;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isHasITBackGround() {
        return hasITBackGround;
    }

    public void setHasITBackGround(boolean hasITBackGround) {
        this.hasITBackGround = hasITBackGround;
    }

    public void studying(){
        System.out.println(getStudentName() + " is studying");
    }

    public void takingBreaks(){
        System.out.println(getStudentName()+ " is taking a break");
    }

    public String toString (){
        System.out.println();
        return "Student name is: "+ getStudentName()+", age: "+getAge()+", grade: "+getGrade()
                +", IT background: "+isHasITBackGround();
    }



    @Override
    public void attendClass(){

    }
}
