package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();

    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireTester(long emplyeID){
        testersTeam.removeIf(p->p.employeeID==emplyeID);
    }












}
