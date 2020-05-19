package day41_Inheritance.Task01;
 /*
 create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering, toString
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */

public class BusinessAnalyst extends Employee {

      /*
    salary  (Inherited)
    name  (Inherited)
    id  (Inherited)
    jobTitle  (Inherited)
    gender  (Inherited)
    writingReq()
    gathering()
    toString() (Inherited)
     */


    public void writingReq(){
        System.out.println(name+" is writing requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requirement");
    }

    public BusinessAnalyst(String name, double salary, long id, char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle="BA";
        this.gender=gender;
    }


}
