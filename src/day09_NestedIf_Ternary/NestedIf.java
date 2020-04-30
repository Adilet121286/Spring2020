package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        Boolean USCitizen = false;
        int age = 33;

        if(USCitizen){

            if (age > 17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("Grow up first and than vote");
            }

        }else {
            System.out.println("Only the US citizen are eligible to vote for Donald Trump");
        }

        System.out.println("=========================================================");

        int score = 98;
        String grade = " ";

        if(score >= 0 && score <=100){

            if(score >= 90){
                grade = "A";
            }else if(score >= 80){
                grade = "B";
            }else if(score >=70){
                grade = "C";
            }else if(score >=60){
                grade = "D";
            }else{
                grade = "F";
            }

        }else{
            grade = "Invalid";
        }
        System.out.println(grade);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        int score2 = 75;

        String grade2 = "";

        if (score2 >= 0 && score2 <= 100){

            grade2 = (score2 >= 90) ? "A" : (score2>=80) ? "B" : (score2>=70) ? "C"
                    : (score2>=60) ? "D" : "F";

        }else{
            grade2 = "Invalid";
        }

        System.out.println(grade2);



    }
}
