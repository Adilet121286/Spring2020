package officeHours.practice_05_06_2020;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setTesterInfo(String name, String jobTitle, double salary,  long employeeId){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary=salary;
        this.employeeId=employeeId;
    }

    public String toString(){
        return "name: "+name+", Job title: "+jobTitle+", salary: $"+salary+", Employee ID: "+employeeId;
    }

    public void smokeTesting(){
        System.out.println(this.name+" is doing smoke tasting");
    }

    public void creatingTicket(){
        System.out.println(this.name+" is creating ticket");
    }


}
