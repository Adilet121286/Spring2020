package Repl_it_Practice_3.Education;

public class EducationalInstitution{
    private int years;

    public EducationalInstitution(int years){ this.years = years; }

    public int getYears(){ return years; }

    public void setYears(int years){ this.years = years; }

    public String graduationRequirements(){
        return years + " years of study";
    }
}
