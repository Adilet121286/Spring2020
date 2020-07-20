package day39_AccessModifiers;

/*
    2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */

public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;

    static String companyName = "BOA";


    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long id){
        this(name,jobTitle);
        this.id = id;
    }

    public Employee(String name, String jobTitle, long id, double salary){
        this(name,jobTitle,id);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, long id, double salary,char gender){
        this(name, jobTitle, id, salary);
        this.gender = gender;
    }


    public String toString(){
        return "Name: "+name+", Job title: "+jobTitle+", Company name: "+companyName+", ID: "+id+", Salary: $"+salary+", Gender: "+gender;
    }



}
