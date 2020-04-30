package day16_ForLoop;

public class CalculateSum100 {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <= 100; i++ ){
            if (i % 2 == 0){        // even numbers
                sum1 += i;

            }else if (i % 2 != 0){
                sum2 +=i;
            }

        }

        System.out.println("Sum of all even numbers: "+sum1);
        System.out.println("Sum of all odd numbers: "+sum2);

    }
}
