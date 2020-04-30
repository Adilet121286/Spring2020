package officeHours.practice_04_22_2020;

public class void_Method {
    public static void main(String[] args) {

        HelloBch18();
        line();

        Vote(19,true);
        line();

        EligibleToBuyCigarete(22);


    }

    public static void line(){
        System.out.println("===============================================================");
    }

    public static void HelloBch18(){
        for (int i=0; i<5;i++){
            System.out.println("Hello Batch 18");
        }
    }

    public static void Vote(int age, Boolean UScitizen){
        boolean eligibleToVote = age >=18 && UScitizen == true;

        if (eligibleToVote){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void EligibleToBuyCigarete(int age){

        if (age >= 21){
            System.out.println("Eligible to buy");
        }else {
            System.out.println("No eligible");
        }
    }

}
