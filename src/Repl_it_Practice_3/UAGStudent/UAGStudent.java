package Repl_it_Practice_3.UAGStudent;

public class UAGStudent {
    String name;
    int grade;
    static String principalName = "Ms. McKoy";
    String studentID;
    static int nextID = 100;

    public UAGStudent(String name, int grade){
        this.name = name;
        this.grade = grade;
        studentID = name.substring(0,1).toUpperCase()+nextID;
        System.out.println(studentID);
        nextID++;
    }

    public static void newPrincipal(String newName){
        principalName = newName;
    }

    public static void resetID(){
        nextID = 100;
    }

    public String toString(){
        return name+" "+studentID;
    }





    public static void main(String[] args) {
        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);

    }




}
