package officeHours.practice_03_18_2020;

public class SingleIF_practice2 {

    public static void main(String[] args) {

        byte age = 12;
        boolean eligbleToBuy = age>21 || age==21; // age >= 21;

        if (eligbleToBuy){
            System.out.println("You can by");
        }
        if ( !eligbleToBuy){
            System.out.println("go drink your milk");
        }

    }

}
