package officeHours.practice_04_15_2020;

public class NestedLoop2 {
    public static void main(String[] args) {

        int[][] numbers = {
                {5, 4, 3, 2, 1},
                {10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };

        for (int j = 0; j < numbers.length; j++) {

            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] % 2 != 0) {
                    System.out.print(numbers[j][i]+" ");
                    continue;
                }

            }

        }
        System.out.println();

        for (int[] Each1D : numbers) {

            for (int eachElement : Each1D) {
                if (eachElement % 2 == 0) {
                    System.out.print(eachElement+" ");
                    continue;


                }
            }


        }
    }
}