package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 101;

        if(number % 2 == 0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+ " is odd number");
        }



        int age = 13;
        boolean alcaholAge = age >= 21;
        if (alcaholAge){
            System.out.println("Here is your vodka");
        }else{
            System.out.println("Here is your milk");
        }



        boolean testPositiveForCorona = !true;

        if (testPositiveForCorona){
            System.out.println("Buy more toilet paper and stay at home");
        }else{
            System.out.println("Do more coding");
        }


    }
}
