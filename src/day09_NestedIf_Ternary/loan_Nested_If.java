package day09_NestedIf_Ternary;

public class loan_Nested_If {
    public static void main(String[] args) {

        double salary = 12000;
        double workHistory = 1.5;
        String loanAgree = "";


        if (salary >= 30000){

            if(workHistory>=2){
                loanAgree = "You are qualified for loan";
            }else{
                loanAgree = "You must have been on job at leasy 2 years ";
            }

        }else{
            loanAgree = "You must earn at least $30,000";
        }

        System.out.println(loanAgree);
        System.out.println("==================================");



    }
}
