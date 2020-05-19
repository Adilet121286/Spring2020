package day41_Inheritance.Task01;

/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
 */
public class Tester extends Employee {
    /*
    name (Inherited)
    salary (Inherited)
    id (Inherited)
    jobtitle (Inherited)
    gender (Inherited)
    reporting()
    testing()
    toString()  (Inherited)
     */

    public Tester(String name,double salary, int id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }


    public void reporting(){
        System.out.println(name+" is reporting");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }


}
