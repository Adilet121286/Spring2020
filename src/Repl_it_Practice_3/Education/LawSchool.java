package Repl_it_Practice_3.Education;

public class LawSchool extends EducationalInstitution{
    public LawSchool(){
        super(3);
    }
    @Override
    public String graduationRequirements(){
        return getYears()+ " years of study and passing the bar";
    }

}
