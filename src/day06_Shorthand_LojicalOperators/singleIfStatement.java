package day06_Shorthand_LojicalOperators;

public class singleIfStatement {

    public static void main(String[] args) {

        boolean coldWather = false;
        if(coldWather){
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean corona = true;
        if(corona){

            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");

        }

        System.out.println("====================================");

        int a  = 102;
        boolean evenNumber = a % 2==0; // if number can be devided by 2 without the remainder
        //boolean oddNumber = a % 2!=0;

            if(evenNumber){
                System.out.println(a + " is an even number");

            }
            /*
            else{
                System.out.println(a + " is an odd number");
            }
            */

            if(!evenNumber){  // if the number is not even number, then it must be odd;

                System.out.println(a+" is an odd number");
            }



    }

}
