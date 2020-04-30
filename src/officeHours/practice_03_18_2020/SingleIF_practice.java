package officeHours.practice_03_18_2020;

public class SingleIF_practice {


        public static void main(String[] args) {
            int a =200;
            int b = 200;

            boolean aGreater = a > b;
            boolean bGreater = b > a;

            boolean aEqualB =  a == b;

            //     boolean aEqualB = aGreater == false && bGreater ==false;
            // if a is not greater than  and b is not greater than a, that means a ==b

            //      boolean aEqualB = aGreater == bGreater;
            // if a is not greater than  and b is not greater than a, that means a ==b


            if(aGreater) {
                System.out.println(a + " is greater number");
            }

            if(bGreater) {
                System.out.println(b + " is greater number");
            }


            if(aEqualB) {
                System.out.println(a + " is equal to " + b);
            }


        }

}
