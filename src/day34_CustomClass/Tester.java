package day34_CustomClass;

public class Tester {
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID,String jobTitle,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    public String toString(){
        return "name: "+name+", emplayee ID: "+employeeID+", job title: "+jobTitle+", salary"+salary;
    }


}
