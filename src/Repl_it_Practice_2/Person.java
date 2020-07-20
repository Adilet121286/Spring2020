package Repl_it_Practice_2;

public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;


    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }

    public boolean verifySSN(String SSN){
       if (ssn == SSN){
           return true;
       }else {
           return false;
       }
    }


}
