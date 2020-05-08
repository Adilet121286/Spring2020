package officeHours.practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();

    public void hireATester(Tester tester){
        testersTeam.add(tester);

    }

    public void fireTester(long ID){
        testersTeam.removeIf(p->p.employeeId==ID);
    }

    public void hireDeveloper(Developer developer){
        devpTeam.add(developer);

    }

    public void fireDeveloper(long ID){
        devpTeam.removeIf(p->p.employeeId ==ID);

    }
}
