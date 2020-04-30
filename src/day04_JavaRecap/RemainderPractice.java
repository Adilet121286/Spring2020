package day04_JavaRecap;

public class RemainderPractice {
    public static void main(String[] args) {
        // 1897651 is odd

        int number = 87654;
        boolean oddNumber = number % 2 !=0;

        boolean divisibleBy3 = number % 3 ==0;
        boolean divisibleBy5 = number % 5 ==0;

        System.out.println("The number "+number+"is odd number: "+oddNumber);
        System.out.println("The number "+number+"is divisible by 3: "+divisibleBy3);
        System.out.println("The number "+number+"is divisible by 5: "+divisibleBy5);


    }

}
