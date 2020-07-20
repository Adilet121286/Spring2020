package Review_Classes.Elmployees;

public class Developer extends Employees implements ScrumTeam, WorkRemotely{

    @Override
    public void work() {

    }

    @Override
    public void meeting() {

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void wprkFromHome() {

    }
    /*
    private String employeeName;
    private long employeeID;
    private double salary;
    private long ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;
     */

    public Developer(String employeeName, long employeeID, double salary,long ssn
            , String jobTitle, boolean isFullTime, boolean hasPTO){
        this.setEmployeeName(employeeName);
        this.setEmployeeID(employeeID);
        this.setSalary(salary);
        this.setSsn(ssn);
        this.setJobTitle(jobTitle);
        this.setFullTime(isFullTime);
        this.setHasPTO(hasPTO);

    }
}
