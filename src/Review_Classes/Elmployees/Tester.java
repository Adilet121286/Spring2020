package Review_Classes.Elmployees;

public final class Tester extends Employees implements ScrumTeam, WorkRemotely{

    @Override
        public void dailyStandUp(){
        System.out.println(getEmployeeName()+" is at stand up meeting");

    }

    @Override
    public void wprkFromHome(){
        System.out.println(getEmployeeName() + " is working from home");
    }

    @Override
    public void work(){
        System.out.println(getEmployeeName()+ " is working");

    }

    @Override
    public void meeting(){
        System.out.println(getEmployeeName()+ " is in the meeteng");

    }

    public String findingBug (){
        return getEmployeeName()+" is finding a Bug";
    }

    public String creatingTicket(){
        return getEmployeeName()+" is creating ticket";
    }





}
