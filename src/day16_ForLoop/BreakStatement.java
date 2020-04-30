package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            System.out.println("Hallo World");
            break;

        }

        for (char i ='a'; i<='z'; i++){
            System.out.println(i);

            if(i == 'd'){
                break;
            }
        }


    }

}
