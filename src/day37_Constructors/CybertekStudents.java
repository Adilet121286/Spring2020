package day37_Constructors;

public class CybertekStudents {
    static String schoolName = "Cybertek";
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents (String studentName, int groupNumber, String batch){

        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber
                + ", School name: "+schoolName;
    }


}

class CObjects{
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Adilet",3,"Batch 18");

        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Saban",12,"Batch 18");
        System.out.println(student2);

    }


}
