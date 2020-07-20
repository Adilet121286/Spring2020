package Review_Classes.Elmployees;

public abstract class Employees {
    private String employeeName;
    private long employeeID;
    private double salary;
    private long ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

    public abstract void work();

    public abstract void meeting();


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name){
        this.employeeName = name;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }

    public String toString(){
        return "Employee name is: "+getEmployeeName()+",\nEmployee ID is: "+getEmployeeID()+
                ",\nSalary: "+getSalary()+",\nSSN: "+getSsn()+", Job title: "+getJobTitle()+
                ",\nFull time"+isFullTime()+", PTO: "+isHasPTO();
    }


}
